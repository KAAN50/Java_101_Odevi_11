import java.util.Scanner;
        public class Main {
            public static void main(String[] args) {
                int ay, gun;

                Scanner input = new Scanner(System.in);
                System.out.println("Ay Giriniz: ");
                ay = input.nextInt();

                System.out.println("Gün Giriniz: ");
                gun = input.nextInt();

                if (ay == 1)
                {
                    if(gun>=1 && gun<=20)
                    {
                        System.out.println("Oğlak");
                    }
                    else if (gun>=21 && gun<=31)
                    {
                        System.out.println("Kova");
                    }

                }

                else if (ay==2)
                {
                    if ((gun>=1) && (gun<=18))
                    {
                        System.out.println("Kova");
                    }
                    else if ((gun>=19) && (gun<=29))
                    {
                        System.out.println("Balık");
                    }
                    else{}
                }

                else if (ay==3)
                {
                    if ((gun>=1) && (gun<=20))
                    {
                        System.out.println("Balık");
                    }
                    else if ((gun>=21) && (gun<=31))
                    {
                        System.out.println("Koç");
                    }
                    else{}
                }

                else if (ay==4)
                {
                    if ((gun>=1) && ( gun<=20))
                    {
                        System.out.println("Koç");
                    }
                    else if ((gun>=21) && (gun<=30))
                    {
                        System.out.println("Boğa");
                    }
                    else{}
                }

                else if (ay==5)
                {
                    if ((gun>=1) && (gun<=20))
                    {
                        System.out.println("Boğa");
                    }
                    else if ((gun>=21) && (gun<=31))
                    {
                        System.out.println("İkizler");
                    }
                    else{}
                }

                else if (ay==6)
                {
                    if ((gun>=1) && (gun<=21))
                    {
                        System.out.println("İkizler");
                    }
                    else if ((gun>=22) && (gun>=30))
                    {
                        System.out.println("Yengeç");
                    }
                    else{}
                }

                else if (ay==7)
                {
                    if ((gun>=1) && (gun<=22))
                    {
                        System.out.println("Yengeç");
                    }
                    else if ((gun>=23) && (gun<=31))
                    {
                        System.out.println("Aslan");
                    }
                    else{}
                }

                else if (ay==8)
                {
                    if ((gun>=1) && (gun<=22))
                    {
                        System.out.println("Aslan");
                    }
                    else if ((gun>=22) && (gun<=31))
                    {
                        System.out.println("Başak");
                    }
                    else{}
                }

                else if (ay==9)
                {
                    if ((gun>=1) && (gun<=22))
                    {
                        System.out.println("Başak");
                    }
                    else if ((gun>=23 && gun<=30))
                    {
                        System.out.println("Terazi");
                    }
                    else{}
                }

                else if (ay==10)
                {
                    if ((gun>=1) && (gun<=23))
                    {
                        System.out.println("Terazi");
                    }
                    else if ((gun>=24) && (gun<=31))
                    {
                        System.out.println("Akrep");
                    }
                    else{}
                }

                else if (ay==11)
                {
                    if ((gun>=1) && (gun<=22))
                    {
                        System.out.println("Akrep");
                    }
                    else if ((gun>=23) && (gun<=30))
                    {
                        System.out.println("Yay");
                    }
                    else{}
                }

                else if (ay==12)
                {
                    if ((gun>=1) && (gun<=21))
                    {
                        System.out.println("Yay");
                    }
                    else if ((gun>=22 && gun<=31))
                    {
                        System.out.println("Oğlak");
                    }
                    else{}
                }
                else {}

            }
        }

       