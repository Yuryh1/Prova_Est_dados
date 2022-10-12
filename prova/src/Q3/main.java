package Q3;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Deque<redesocial> redeSocial = new LinkedList<redesocial>();

        int key=0;
        String publi;
        byte relevante;
        do {
            System.out.println("<1>Selecion o post para cadastrar \n<2>Mais relevantes\n<3>Sair");
            key = scan.nextInt();
            scan = new Scanner(System.in);
            switch (key){
                case 1:

                    System.out.println("Qual seu post de hoje? ");
                    publi = scan.nextLine();


                    System.out.println("É um post relevante? (1=relevante | 2=normal)");
                    relevante = scan.nextByte();

                    if (relevante==1){
                        redesocial Post = new redesocial(publi, relevante);
                        redeSocial.addFirst(Post);
                    } else if (relevante == 2) {
                        redesocial Post = new redesocial(publi, relevante);
                        redeSocial.addLast(Post);
                    }else{
                        System.out.println("Coloque a importancia do seu post !");
                    }

                    break;
                case 2:

                    for (redesocial post: redeSocial){
                        if (post.getRelevancia()==1){
                            System.out.println(post.getMsg() +"\n");
                        }
                    }

                    break;
                case 3:
                    System.out.println("Nosso time agradece pela preferencia ");
                    break;
                default:
                    System.out.println("inválido!!!");

            }

        }while(key!=3);
    }
}