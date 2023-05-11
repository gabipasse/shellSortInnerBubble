public class shellSortInnerBubble {

    public void shellSortIB(int[] arr){

        int n = arr.length;

        for(int gap = n / 2; gap > 0; gap /= 2){

            for (int k = 0; k < n / gap; k++){

                int temp = 0;

                for (int i = k; i * gap <= n - 1; i+= gap) {


                    for (int j = gap; j * gap <= n - 1; j += gap) {

                        System.out.println(j);

                        System.out.println(j - gap);

                        if (arr[j - gap] > arr[j]) {

                            temp = arr[j - gap];

                            arr[j - gap] = arr[j];

                            arr[j] = temp;

                        }

                    }

                }

            }

        }

    }

}
