public class MultiDimensionalArray{
    public static void main(String[] args) {
        int nums[][]= new int[3][4];
        
        for(int i=0; i<3; i++){
            for (int j=0;j<4;j++){
                nums[i][j] = (i+1)*(j+1);
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        // Using Math.random method
        double num [][]= new double[3][4];
        for(int i=0; i<3; i++){
            for (int j=0;j<4;j++){
                num[i][j]=(Math.random()*10);
            }
        }
        for (int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }


        // 2D wtih Assigning Values
        int Values[][]=new int[3][3];

        Values[0][0]=1;
        Values[0][1]=2;
        Values[0][2]=3;
        Values[1][0]=4;
        Values[1][1]=5;
        Values[1][2]=6;
        Values[2][0]=7;
        Values[2][1]=8;
        Values[2][2]=9;

        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(Values[i][j] + " ");
            }
            System.out.println();
        }

          // Initialization with values

          int nums2[][]={{1,2,3,4},{2,3,4,5},{3,4,5,6}};

          for(int i=0;i<nums2.length;i++){
            for (int j=0;j<nums2[i].length;j++){
                System.out.print(nums2[i][j] + " ");
            }
            System.out.println();

        }


    }
}