public class jaggedand3Darray {
    public static void main(String[] args) {

        int num[][]=new int[3][]; // jagged Array
        num[0]=new int[2];
        num[1]=new int[3];
        num[2]=new int[4];

        for (int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                num[i][j]=(int)(Math.random()*10); //using Math.random method
            }
        }
        //using Enhansing Loop
        for (int n[]:num){
            for(int m:n){
                System.out.print(m+" ");
            }
            System.out.println();
        }System.out.println();
        

        // 3D Array
        int threeD[][][]=new int[3][4][5];
        for (int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                for (int k=0;k<5;k++){
                    threeD[i][j][k]=(int)(Math.random()*10);
                }
            }
        }
        for (int n[][]:threeD){
            for (int m[]:n){
            for(int o:m){
                System.out.print(o+" ");
            }
        System.out.println();
    }System.out.println();
       
}
    
}
}
