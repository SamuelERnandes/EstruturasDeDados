public class Vetoresex1 {
    public static void main(String[] args) {
        String[] comandosValidos = {"use","help","get","inventory","with"};
        String comando = "Use FILTRO with CAFE";


        //array
       String[] strings = comando.split(" ");
        for(int i = 0; i < strings.length; i++) {
            if(i == 0) {
                String cmd = strings[i];
                for(int j = 0; j < comandosValidos.length; j++) {
                    if(cmd.equalsIgnoreCase(comandosValidos[j])) {
                        System.out.println("comando válido: "+ cmd);
                        break;
                    }else {
                        System.out.println("não entedi ...");
                    }
                }
            }else {
                System.out.println("outros comandos: "+strings[i]);
            }

        }

    }
}








