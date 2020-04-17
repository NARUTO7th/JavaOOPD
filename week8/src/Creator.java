import java.util.ArrayList;
import java.util.Scanner;

 abstract class Creator {

    private ArrayList<library> libs = new ArrayList<> ();

    void getInfo(){
        while(true){
            Scanner sc = new Scanner (System.in);
            System.out.println ("– 增加书籍、期刊与报纸\n" + "– 更新书籍、期刊与报纸\n"
                    + "– 删除书籍、期刊与报纸\n" + "– 查询书籍、期刊与报纸\n" + "请输入一下五个指令之一 :\n"
                    + "’增加‘，‘更新’，‘删除’，‘查询’，‘退出’");
            String firstS = sc.nextLine ();
            library lib = null;
            if(firstS.equals ("退出")) break;
            if(!firstS.equals("更新") && !firstS.equals ("查询")){
                System.out.println ("请输入项目（书籍、期刊或报纸）以及项目名和编号:");
                String line;
                while(true){
                    line = sc.nextLine ();
                    if(line.split ("\\s+").length == 3){break;}
                    else System.out.println ("请输入正确指令：");
                }
                String type = line.split("\\s+")[0];
                String name = line.split("\\s+")[1];
                String no = line.split("\\s+")[2];

                lib = factoryMethod (type, name, no);
            }

            boolean result = true;
            String secondS;
            switch(firstS){
                case "增加" :
                    result = add (lib);
                    break;
                case "更新" :
                    System.out.println ("请输入原项目名以及更改后的项目名，项目编号，并用空格隔开：");
                    secondS = sc.nextLine ();
                    result = modify (secondS);
                    break;
                case "删除" :
                    result = delete (lib);
                    break;
                case "查询" :
                    System.out.println ("请输入需要查询的项目的名称：");
                    secondS = sc.nextLine ();
                    System.out.println (search (secondS));
                    break;
                default:
                    result = false;
            }

            if(result){
                System.out.println ("操作成功");
            }else System.out.println ("操作失败");
        }
    }

    private boolean add(library lib){
        libs.add (lib);
        return libs.contains (lib);
    }
    private boolean delete(library lib){
        libs.remove (lib);
        return !(libs.contains (lib));
    }

    private boolean modify(String s){
        if(s.split ("\\s+").length != 3) return false;
        String name = s.split("\\s+")[0];
        String reName = s.split("\\s+")[1];
        String reNo = s.split("\\s+")[2];

        for(library l : libs){
            if(l.getItemName ().equals (name)){
                l.setItemNo (reNo);
                l.setItemName (reName);
                return true;
            }
        }
        return false;
    }

     private library search(String name){
         for(library l : libs){
             if(l.getItemName ().equals (name)){
                 return l;
             }
         }
         return null;
     }

    abstract library factoryMethod(String kind, String name, String no);
}
