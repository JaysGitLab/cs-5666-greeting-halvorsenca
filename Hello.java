public class Hello {
    public Hello(){
    }
    public void sayHelloToMe() {
        System.out.println("Hello, Chad");
    }
    public void sayHelloToSomeone(String name) {
        String out = name.substring(0,1).toUpperCase() + name.substring(1);

        System.out.println("Hello, " + out);
    }
    public void sayHelloConversation(String name1, String name2) {
        String propName1 = name1.substring(0,1).toUpperCase() + name1.substring(1);
        String propName2 = name2.substring(0,1).toUpperCase() + name2.substring(1);

        System.out.println("Hello, " + propName2);
    }
    public static void main(String[] args) {
        Hello hello = new Hello();
        if (args.length == 0 ) {
            hello.sayHelloToMe();
        }
        else if (args.length == 1) {
            hello.sayHelloToSomeone(args[0]);
        }
        else if (args.length == 2) {
            hello.sayHelloConversation(args[0],args[1]);
        }
        else {
            System.out.println("you must have a name, right?");
        }
    }
}

