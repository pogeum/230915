import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        청둥오리 a청둥오리 = new 청둥오리(); // 청둥오리가 만들어집니다. 청둥오리는 기본 날개를 가지고 태어납니다.

        a청둥오리.날다(); // 청둥오리가 날개로 천천히 날아갑니다.

        흰오리 a흰오리 = new 흰오리(); // 흰오리가 만들어집니다. 흰오리 불사조 날개를 가지고 태어납니다.

        a흰오리.날다(); // 흰오리가 불사조 날개로 불타오르며 날아갑니다.

        붉은오리 a붉은오리 = new 붉은오리(); // 붉은오리가 만들어집니다. 붉은오리는 로켓 날개를 가지고 태어납니다.

        a붉은오리.날다(); // 붉은오리가 로켓날개로 놀라운 속도로 굉음을 내며 날아갑니다
        */

        Scanner scan = new Scanner(System.in);

        System.out.println("높이 입력 : ");
        int h = scan.nextInt(); //5
        int hl = h; //5

        for (int i = 1; i <= h; i++) { // 1 -> 2 -> 3 -> 4 -> 5

            hl--; // 4 3
            //빈칸개수j     별개수st
            // 4 반복= i-1     1 반복  -> i=1 i*2 -1 =별
            // 3             3       -> i=2
            // 2             5       -> i=3
            // 1             7       -> i=4
            // 0             9       -> i=5
            for (int j = hl; j > 0; j--) {
                System.out.print(" ");
            }
            for (int st = 1; st <= ((i * 2) - 1); st++) {
                System.out.print("*");
            }
            System.out.println("\n");

        }



    }
}
class 오리 {
    String 오리이름;
    날개 a날개;

    void 생성메시지(){
        System.out.println(오리이름+"가 만들어집니다."+ 오리이름 + "는" + a날개.날개이름 + " 를 가지고 태어납니다.");
    }
    void 날다(){
         System.out.println(오리이름 + "가");
         a날개.사용();
    }


}
class 청둥오리 extends 오리{
    청둥오리(){
        오리이름 = "청둥오리";
        a날개 = new 기본날개();
        생성메시지();
    }

}
class 흰오리 extends 오리{
    흰오리(){
        오리이름 = "흰오리";
        a날개 = new 불사조날개();
        생성메시지();
    }
}
class 붉은오리 extends 오리{
    붉은오리(){
        오리이름="붉은오리";
        a날개 = new 로켓날개();
        생성메시지();
    }
}
class 날개 {
    String 날개이름;
    String 날기모션;

    void 사용(){
        System.out.println(날개이름 + "로" + 날기모션 + "날아갑니다.");
    }

}
class 기본날개 extends 날개 {
    기본날개(){
        this.날개이름="기본날개";
        this.날기모션="천천히";
    }
    //천천히 날아갑니다.
}
class 불사조날개 extends 날개 {
    불사조날개(){
        this.날개이름="불사조날개";
        this.날기모션="불타오르며";
    }
//    /불타오르며 날아갑니다.
}
class 로켓날개 extends 날개 {
//    놀라운 속도로 굉음을 내며 날아갑니다
    로켓날개(){
        this.날개이름="로켓날개";
        this.날기모션="놀라운 속도로 굉음을 내며";
    }

}
