import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String userName , password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500 ;
        int select ;

        while (right > 0 ){
            System.out.println("Kullanıcı Adınız : ");
            userName = input.nextLine();
            System.out.println("Parolanız :");
            password = input.nextLine();

            if(userName.equals("şerif") && password.equals("gumuscu123")){
                System.out.println("Merhaba Şerif bankasına hoş geldiniz.");
                do{

                    System.out.print("1-Para Yatırma \n" +
                            "2-Para Çekme \n" +
                            "3-Bakiye Sorgula \n" +
                            "4 -Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    switch (select){
                        case 1 :
                            System.out.print("Yatırılacak Para Miktarı : ");
                            int price = input.nextInt();
                            balance += price;
                            System.out.println("Son Bakiyeniz : "+balance);
                            System.out.println("Tekrar görüşmek üzere .");
                            break;
                        case 2 :
                            System.out.print("Çekmek İstediğiniz Para Miktarı : ");
                            int price_2 = input.nextInt();
                            if (price_2>balance){
                                System.out.println("Bakiye yetersiz .");
                            }else{
                                balance -= price_2;
                                System.out.println("Son Bakiyeniz : " + balance);
                                System.out.println("Tekrar görüşmek üzere.");
                            }break;
                        case 3 :
                            System.out.println("Bakiyeniz : "+balance);
                            break;
                        case 4 :
                            System.out.println("Tekrar görüşmek üzere...");
                            break;

                    }
                }while (select != 4 );
                System.out.println("Tekrar görüşmek üzere.");
                break;
            }else{
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre!! Tekrar deneyiniz !!");
                if (right == 0 ){
                    System.out.println("Hesabınız bloke olmuştur.Lütfen banka ile iletişime geçiiniz.");
                }
                System.out.println("Kalan hakkınız : " + right);

            }
        }


    }
}
