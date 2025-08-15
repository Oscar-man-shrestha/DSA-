

public class oddOrEven {
   public static void oddOrEven(int n){
    int bitMask = 1;
    if((n&bitMask)==0){
        System.out.println("Even");
    }
    else{
        System.out.println("Odd");
    }

   }

   public static int getIthBit(int n,int i){
    int bitMask =  1<<i;
    if((bitMask&n)==0){
        return 0;
    }else{
        return 1;
    }
   }

   public static int setTthBit(int n,int i){
    int bitMask=1<<i;
   return n|bitMask;
   }

    public static int clearTthBit(int n,int i){
   int bitMask = ~(1<<i);
   return bitMask&n;
   }

    public static int updateIthBit(int n,int i,int newBit){
//         if(newBit==0){
//             return clearTthBit(n, newBit);
//         }else{
//             return setTthBit(n, newBit);
//         }
//    }

int n=clearTthBit(n, newBit);
int bitMask =newBit<<i;
 

    public static void main(String[] args) {
        System.out.println(getIthBit(10,2));
         System.out.println(setTthBit(10,2));
         System.out.println(clearTthBit(10, 1));
         System.out.println(updateIthBit(0, 0, 0));
    }
}
