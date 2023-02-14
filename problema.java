import javax.swing.text.StyledEditorKit.ForegroundAction;

/**
 * problema1
 */


 public class problema {
    public void entrada1() {
        int m1,m2,n;
        String primeraInst, segundaInst, mensaje, mensajeAuxiliar[]={"",""};/* s mensajeAux2=""*/;
        primeraInst="CeseAlFuego"; //a
        segundaInst="Corran->Cubierta";
        //       XXcaaamakkCCxessseAAllFueeegooDLLKmmNNN
        mensaje="XXCaaamakkCxessCseAAllFueeegooDCLLKmmNNN"; //b
        m1=primeraInst.length();
        m2=segundaInst.length();
        n=mensaje.length();
        System.out.println("leyendo datos");
    //    dt(2);
        System.out.println(
            m1 +" "+ m2+" "+n+"\n"+
            primeraInst+"\n"+
            segundaInst +"\n"+
            mensaje
        );
        String instrucciones[] ={primeraInst,segundaInst};
        char arrayMensaje[] =mensaje.toCharArray();
        int m[]={m1,m2};
        for (int i = 0; i < instrucciones.length; i++) {
            for (int j = 0; j < m[i]; j++) {
                for (int k = 0; k < n; k++) {
                    if (instrucciones[i].toCharArray()[j]==arrayMensaje[k]){
                        mensajeAuxiliar[i]=mensajeAuxiliar[i]+arrayMensaje[k];
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < 2; i++) {
            if (mensajeAuxiliar[i].equals(instrucciones[i])) {
                System.out.println("si");
            }else{
                System.out.println("no");
            }
        }
        
    }
    public void entrada2() {
        int r=5, c=3;
        int x[][] =new int[r][c];
        int row ,col , y[][]={{1,140,82},
                   {2,89,134},
                   {3,90,110},
                   {4,112,106},
                   {5,88,90}
                };
        row=y.length;
        col=y[0].length;
        System.out.println(row+"  " +col);
        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < y[0].length; j++) {
                //System.out.println("arr[" + i + "][" + j + "] = "+ y[i][j]);
                System.out.print(y[i][j]+" "); // i=row,j=colum
            }
            System.out.println();
        }
        int sumaAcu[]=new int[row];
        System.out.println();
        int acumulado[]={y[0][1]+y[1][1], y[1][1]+y[1][2]};
        int suma=0;
        for (int j=1;j<col;j++) {
            suma =0;
            for (int i = 0; i < row; i++) {
                suma=suma+y[i][j];
                sumaAcu[i]=suma;
                System.out.print(suma+"  ");
            }
            System.out.println();

            System.out.println(suma+" "+sumaAcu[j]);
            
        }
    for (int i = 0; i < sumaAcu.length; i++) {
        System.out.println(sumaAcu[i]);
    }
    }
    

}
