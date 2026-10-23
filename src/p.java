public class p {
    public void main(String[] args) {
        double[][] garden = {
            {67, 67, 45, 89, 12, 54},
            {78, 31, 19, 62, 95, 41},
            { 8, 56, 73, 27, 48, 84},
            {64, 16, 92, 38, 51, 29},
            {43, 81, 24, 70, 35, 59}
        };
        reader(plantdriest(garden));
    }
    public int[] driestPlants(double[][] g){
        int[] rowAndCol= new int[2];
        double minmoisture=100;
        for(int i=0; i<g.length; i++){
            for(int j=0; j<g[0].length;j++) {
                if(g[i][j]<minmoisture) {
                    minmoisture = g[i][j];
                    rowAndCol[0]=i;
                    rowAndCol[1]=j;
                }
            }
        }
        return rowAndCol;
    }
    public String[] plantdriest(double[][] g){
        String[] read= new String[1];
        int[] rowandcol= driestPlants(g);
            read[0]="The driest Plant is located in row "+(rowandcol[0]+1)+", column "+ (rowandcol[1]+1);
        return read;
    }
    public double[] rowMoisture(double [][] g){
        double[] rows= new double[g.length];
        double rowcount= 0;
        double rowaverage;
        for(int i=0; i<g.length; i++) {
            for (int j = 0; j < g[0].length; j++) {
                rowcount+=g[i][j];
            }
            rowaverage=rowcount/g[0].length;
            rows[i]=rowaverage;
            rowcount=0;
        }
        return rows;
    }
    public String[] moisturerows(double[][] g){
        String[] read= new String[g.length];
        double[] rows= rowMoisture(g);
        for(int i=0; i<g.length; i++) {
            read[i]="The average moisture of row "+(i+1)+" is: "+rows[i]+" percent.";
        }
        return read;
    }
    public void reader(double[] g){
        for(int i=0; i<g.length; i++){
            System.out.println(g[i]);
        }
    }
    public void reader(String[] g){
        for(int i=0; i<g.length; i++){
            System.out.println(g[i]);
        }
    }
    public void reader(int[] g){
        for(int i=0; i<g.length; i++){
            System.out.println(g[i]);
        }
    }
}
