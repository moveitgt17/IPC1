package practicauno_201800624;
import java.util.Scanner;


public class PracticaUno_201800624 {
 public static String[][] usuarios = new String[30][2];
public static Object[][] bodega = new Object[25][4];
public static Object[][] bodega1 = new Object[25][4];
public static Object[][] bodega2 = new Object[25][4];
public static Object[][] bodega3 = new Object[25][4];
public static Object[][] bodega4 = new Object[25][4];
public static Object[][] bodega5 = new Object[25][4];
public static Object[][] bodega6 = new Object[25][4];
public static Object[][] bodega7 = new Object[25][4];
public static Object[][] bodega8 = new Object[25][4];
public static Object[][] bodega9 = new Object[25][4];

  public static void main(String[] args) {
        LogIn();
    }
  public static void cargarUsuarios(){
    String c1;
    Scanner ent = new Scanner(System.in);
    c1 = ent.nextLine();
      // String c1 = " Carlos,123@Luis,1d4@Pepe,1459";
       String[] c2 = c1.split("@");
      //  System.out.println(c2[2]);
      for(int i=0; i<c2.length; i++){
           String user = c2[i];
           String[] at = user.split(",");
             for(int j=0; j<usuarios.length; j++){
                if(usuarios[j][0] == null && usuarios[j][1] == null){
                    usuarios[j][0] = at[0]; 
                    usuarios[j][1] = at[1];
                  break;
            }   
       }   
    }
    }
  public static void LogIn(){
        boolean probar = true;
        usuarios [0][0] = "c";
        usuarios [0][1] = "1";
        String ent, ent1;
        Scanner entrada = new Scanner(System.in);
        Scanner entrada1 = new Scanner(System.in);
        while(probar){ 
        System.out.println("Bienvenido a tu tienda :) \npara ingresar ingresa tu usuario y contraseña");
        System.out.println("");
        System.out.println("Usuario:");
        ent = entrada.nextLine();
        System.out.println("");
        System.out.println("Contraseña:");
        ent1 = entrada1.nextLine();
 
        for (int i=0; i<usuarios.length; i++) {
            if (ent.equals(usuarios[i][0])){
                 if( ent1.equals(usuarios[i][1])) {
                     System.out.println("Usuario y contraseña correctos bienvenido");
                     System.out.println("");
                     menuPrincipal();
                     probar = false;
               break;
            }
        }}
        System.out.println("[Usuario o contraseña incorrectos]");
        }}
  public static void menuPrincipal(){
      System.out.println("MENU PRINCIPAL:");
      System.out.println("(Ingrese el número de la accion que desea realizar)");
      System.out.println("1. Bodegas");
      System.out.println("2. Traslado de productos");
      System.out.println("3. Administradores");
      System.out.println("4. Reportes");
      System.out.println("5. Regresar");
      System.out.println("6. Salir");
      accionesMenuPrincipal();
      
  }
  public static void accionesMenuPrincipal(){
      int escoger;
      escoger = getOtro("[Advertencia]: (Si ingresa un valor diferente a los asignados para cada acción \nusted deberá ingresar el número de accion nuevamente hasta que escoja uno correcto)");
      
      
          switch (escoger) {
              case 1:{menuBodega(); 
                  break;}
              case 2:{ menuTraslado();
                  break;}
              case 3:{ menuAdmin();
                  break;}
              case 4:{ menuReportes();
                  break;}
              case 5:{
                LogIn(); }
                  break;
              case 6:{
                  System.exit(6);
              }
              default:{
                  System.out.println("El dato que ingresaste no existe");
                  break;}
          }
      
      }
  public static int getOtro(String uno){
      Scanner dato = new Scanner(System.in);
      String s1 = "";
      while(s1.equals("")){
          System.out.println(uno);
          s1 = dato.nextLine();
          if(!s1.matches("[1-6]")){
              s1 = "";
              menuPrincipal();
          }
      }
      return Integer.parseInt(s1);
  }
  public static void menuBodega(){
      System.out.println("MENU DE BODEGAS:");
      System.out.println("(Ingrese el número de la accion que desea realizar)");
      System.out.println("1. Agregar Productos");
      System.out.println("2. Modificar Inventario");
      System.out.println("3. Ver Inventario Actual");
      System.out.println("4. Regresar");
      accionesBodega();
      
  }
  public static void menuAdmin(){
      System.out.println("MENU AREA ADMINISTRATIVA");
      System.out.println("(Ingrese el número de la accion que desea realizar)");
      System.out.println("1. Agregar Administradores");
      System.out.println("2. Modificar Administradores");
      System.out.println("3. Eliminar Administradores");
      System.out.println("4. Regresar");
      accionesAdmin();
  }
  public static void menuReportes(){
      System.out.println("Reportes");
      System.out.println("(Ingrese el número de la accion que desea realizar)");
      System.out.println("1. Productos en X stock");
      System.out.println("2. Productos trasladados por categoría");
      System.out.println("3. Productos trasladados por administrador");
      System.out.println("4. Bodega con menos productos");
      System.out.println("5. Bodega con más productos");
      System.out.println("6. Bodega con menos productos por artículo");
      System.out.println("7. Bodega con más productos por arítculo");
      System.out.println("8. Gráfico de la distribución de artículos");
      System.out.println("9. Regresar");
      accionesReportes();
  }
  public static void menuTraslado(){
      System.out.println("TRASLADO DE PRODUCTOS");
      System.out.println("(Ingrese el número de la accion que desea realizar)");
      System.out.println("");
      System.out.println("1. Trasladar Producots");
      System.out.println("2. Regresar");
      accionesTraslado();
  }
  public static void accionesBodega(){
      int escogerB;
      escogerB = getOtroB("[Advertencia]: (Si ingresa un valor diferente a los asignados para cada acción \nusted deberá ingresar el número de accion nuevamente hasta que escoja uno correcto)");
       switch (escogerB) {
              case 1:{ cargarBodegas();
                  break;}
              case 2:{ modificar();
                  break;}
              case 3:{ inventario();
                  break;}
              case 4:{ menuPrincipal(); 
                  break;}
              default:{
                  System.out.println("El dato que ingresaste no existe");
                  break;}
          }
      
  }
  public static int getOtroB(String dos){
      Scanner dato1 = new Scanner(System.in);
      String s2 = "";
      while(s2.equals("")){
          System.out.println(dos);
          s2 = dato1.nextLine();
          if(!s2.matches("[1-4]")){
              s2 = "";
              menuBodega();
          }
      }
      return Integer.parseInt(s2);
  }
  public static void accionesAdmin(){
       int escogerA;
      escogerA = getOtroA("[Advertencia]: (Si ingresa un valor diferente a los asignados para cada acción \nusted deberá ingresar el número de accion nuevamente hasta que escoja uno correcto)");
       switch (escogerA) {
              case 1:{ agregarUsuario();
                  break;}
              case 2:{ modificarUsuario();
                  break;}
              case 3:{ eliminarUsuario();
                  break;}
              case 4:{ 
                 menuPrincipal();
                  break;}
              default:{
                  System.out.println("El dato que ingresaste no existe");
                  break;}
          }
  }
  public static int getOtroA(String tres){
      Scanner dato2 = new Scanner(System.in);
      String s3 = "";
      while(s3.equals("")){
          System.out.println(tres);
          s3 = dato2.nextLine();
          if(!s3.matches("[1-4]")){
              s3 = "";
              menuAdmin();
          }
      }
      return Integer.parseInt(s3);
  }
  public static void accionesReportes(){
        int escogerR;
      escogerR = getOtroR("[Advertencia]: (Si ingresa un valor diferente a los asignados para cada acción \nusted deberá ingresar el número de accion nuevamente hasta que escoja uno correcto)");
       switch (escogerR) {
              case 1:{
                  reporteStock();
                  menuReportes();
                  break;}
              case 2:{
                  break;}
              case 3:{ 
                  break;}
              case 4:{ 
                  break;}
              case 5:{ 
                  break;}
              case 6:{ 
                  break;}
              case 7:{ 
                  break;}
              case 8:{ 
                  break;}
              case 9:{ menuPrincipal();
                  break;}
              default:{
                  System.out.println("El dato que ingresaste no existe");
                  break;}
          }
  }
  public static int getOtroR(String cuatro){
      Scanner dato3 = new Scanner(System.in);
      String s4 = "";
      while(s4.equals("")){
          System.out.println(cuatro);
          s4 = dato3.nextLine();
          if(!s4.matches("[1-9]")){
              s4 = "";
              menuReportes();
          }
      }
      return Integer.parseInt(s4);
  }
  public static void agregarUsuario(){
      System.out.println("AGREGAR USUARIO");
      System.out.println("(Ingrese el número de la accion que desea realizar)");
      System.out.println("");
      System.out.println("1. Agregar en consola");
      System.out.println("2. Carga masiva de datos");
      System.out.println("3. Regresar");
      accionesAgregarUsuario();
  }
  public static void accionesAgregarUsuario(){
       int escogerAU;
      escogerAU = getOtroAU("[Advertencia]: (Si ingresa un valor diferente a los asignados para cada acción \nusted deberá ingresar el número de accion nuevamente hasta que escoja uno correcto)");
       switch (escogerAU) {
              case 1:{ agregarUsuarioConsola();
                  break;}
              case 2:{ agregarUsuarioCargaMasiva();
                  break;}
              case 3:{ menuAdmin();
                  break;}
              default:{
                  System.out.println("El dato que ingresaste no existe");
                  break;}
          }
  }
  public static int getOtroAU(String cinco){
      Scanner dato4 = new Scanner(System.in);
      String s5 = "";
      while(s5.equals("")){
          System.out.println(cinco);
          s5 = dato4.nextLine();
          if(!s5.matches("[1-3]")){
              s5 = "";
              agregarUsuario();
          }
      }
      return Integer.parseInt(s5);
  }
  public static void agregarUsuarioCargaMasiva(){
      System.out.println("Ingrese la carga masiva de Usuarios que deseea agregar");
      cargarUsuarios();
      System.out.println("");
      imprimirUsuarios();
      agregarUsuario();
      
  }
  public static void agregarUsuarioConsola(){
       String usuario;
       String password;
       System.out.println("Ingrese el nombre del usuario que desea agregar");
       usuario = getString();
       System.out.println("Ingrese la contraseña que desea agregar");
       password = getString();
       for(int k=0; k<usuarios.length; k++){
           if(usuarios[k][0] == null &&  usuarios[k][1] == null){
               usuarios[k][0] = usuario;
               usuarios[k][1] = password;
               break;
           }
       }
       System.out.println("");
      imprimirUsuarios();
      agregarUsuario();
      
  }
  public static String getString(){
      String usuari = "";
      Scanner sc = new Scanner(System.in);
      while(usuari.equals("")){
          usuari = sc.nextLine();
      }
      return usuari;
  }
  public static void eliminarUsuario(){
      int seleccionar;
      imprimirUsuarios();
      System.out.println("Ingrese el número del usuario que desea eleminar");
      seleccionar = getElim("[para volver al menu presione 0]");
      if(seleccionar == 0){
          menuAdmin();
      }
      usuarios[seleccionar][0] = null;
      usuarios[seleccionar][1] = null;
      System.out.println("Usuario eleminado correctamente");
      menuAdmin();
      
      
  }
  public static int getElim(String arg){
      Scanner dato5 = new Scanner(System.in);
      String s6 = "";
      while(s6.equals("")){
          System.out.println(arg);
          s6 = dato5.nextLine();
          if(!s6.matches("[0-9]")){
              s6 = "";
          }
      }
      return Integer.parseInt(s6);
  }
  public static void modificarUsuario(){
      imprimirUsuarios();
      int seleccion;
      
      System.out.println("Ingrese el número del usuario que desea modificar");
      seleccion = getElim("[para volver al menu presione 0]");
      if(seleccion == 0){
          menuAdmin();
      }
      String usuario1;
      String password1;
      System.out.println("Ingrese el nuevo nombre de usuario que desea modificar");
      usuario1 = getString();
      System.out.println("Ingrese la nueva contraseña que desea modificar");
      password1 = getString();
      usuarios[seleccion ][0] = usuario1;
      usuarios[seleccion ][1] = password1;
      System.out.println("Usuario modificado correctamente");
      menuAdmin();
  }
  public static void imprimirUsuarios(){
      int contador = 0;
      for(int x=0; x<usuarios.length;x++){
         if(usuarios[x][0] != null && usuarios[x][1] != null){
             System.out.println("NUMERO        USUARIO              CONTRASEÑA");
             System.out.println(contador - 1+"." + "            " +usuarios[x][0]+ "                    "+ usuarios[x][1]); 
         }contador++;
      }
  }
  public static void cargarBodegas(){
      System.out.println("");
      System.out.println("");
      System.out.println("AGREGAR PRODUCTOS");
      System.out.println("(Ingrese el número de la accion que desea realizar)");
      System.out.println("");
      System.out.println("1. Agregar en consola");
      System.out.println("2. Carga masiva de datos");
      System.out.println("3. Regresar");
      accionescargarBodegas();
  }
  public static void accionescargarBodegas(){
      int escogerAU;
      escogerAU = getOtroAU("[Advertencia]: (Si ingresa un valor diferente a los asignados para cada acción \nusted deberá ingresar el número de accion nuevamente hasta que escoja uno correcto)");
       switch (escogerAU) {
              case 1:{ 
                  agregarProductosConsola();
                  break;}
              case 2:{ agregarProductosCargaMasiva();
                  break;}
              case 3:{ 
                  menuBodega();
                  break;}
              default:{
                  System.out.println("El dato que ingresaste no existe");
                  break;}
          }
  }
  public static void agregarProductosConsola(){
      System.out.println("Seleccione el número de bodega donde desea almacenar el nuevo producto");
        String noBodega = getOtroo("[Adv]");
        System.out.println("Ingrese el nombre del producto que desea agreagar");
        String nombre = getString();
        System.out.println("Ingrese el número de existencias del producto que desea agreagar");
        String stock = getOtroStock("[Ingrese un dato correcto]");
        System.out.println("Ingrese el precio del producto que desea agregar");
        double precio = getOtroPP("Ingrese un dato correcto]");
        System.out.println("Ingrese la categoria del producto que desea agregar");
        String categoria = getString();
        switch(Integer.parseInt(noBodega)){
            case 0:{
               for(int x=0; x<bodega.length; x++){
                       if(bodega[x][0] == null && bodega[x][1] == null){
                           bodega[x][0] = nombre;
                           bodega[x][1] = stock;
                           bodega[x][2] = precio;
                           bodega[x][3] = categoria;
                           break;
                   }} 
                break;
            }
            case 1:{
                for(int x=0; x<bodega1.length; x++){
                       if(bodega1[x][0] == null && bodega1[x][1] == null){
                           bodega1[x][0] = nombre;
                           bodega1[x][1] = stock;
                           bodega1[x][2] = precio;
                           bodega1[x][3] = categoria;
                           break;
                   }}
                break;
            }
            case 2:{
                 for(int x=0; x<bodega2.length; x++){
                       if(bodega2[x][0] == null && bodega2[x][1] == null){
                           bodega2[x][0] = nombre;
                           bodega2[x][1] = stock;
                           bodega2[x][2] = precio;
                           bodega2[x][3] = categoria;
                           break; }}
                break;
            }
            case 3:{
                 for(int x=0; x<bodega3.length; x++){
                       if(bodega3[x][0] == null && bodega3[x][1] == null){
                           bodega3[x][0] = nombre;
                           bodega3[x][1] = stock;
                           bodega3[x][2] = precio;
                           bodega3[x][3] = categoria;
                           break; }}
                break;
            }
            case 4:{
                 for(int x=0; x<bodega4.length; x++){
                       if(bodega4[x][0] == null && bodega4[x][1] == null){
                           bodega4[x][0] = nombre;
                           bodega4[x][1] = stock;
                           bodega4[x][2] = precio;
                           bodega4[x][3] = categoria;
                           break; }}
                break;
            }
            case 5:{
                 for(int x=0; x<bodega5.length; x++){
                       if(bodega5[x][0] == null && bodega5[x][1] == null){
                           bodega5[x][0] = nombre;
                           bodega5[x][1] = stock;
                           bodega5[x][2] = precio;
                           bodega5[x][3] = categoria;
                           break; }}
                break;
            }
            case 6:{
                 for(int x=0; x<bodega6.length; x++){
                       if(bodega6[x][0] == null && bodega6[x][1] == null){
                           bodega6[x][0] = nombre;
                           bodega6[x][1] = stock;
                           bodega6[x][2] = precio;
                           bodega6[x][3] = categoria;
                           break; }}
                break;
            }
            case 7:{
                 for(int x=0; x<bodega7.length; x++){
                       if(bodega7[x][0] == null && bodega7[x][1] == null){
                           bodega7[x][0] = nombre;
                           bodega7[x][1] = stock;
                           bodega7[x][2] = precio;
                           bodega7[x][3] = categoria;
                           break; }}
                break;
            }
            case 8:{
                 for(int x=0; x<bodega8.length; x++){
                       if(bodega8[x][0] == null && bodega8[x][1] == null){
                           bodega8[x][0] = nombre;
                           bodega8[x][1] = stock;
                           bodega8[x][2] = precio;
                           bodega8[x][3] = categoria;
                           break; }}
                break;
            }
            case 9:{
                 for(int x=0; x<bodega9.length; x++){
                       if(bodega9[x][0] == null && bodega9[x][1] == null){
                           bodega9[x][0] = nombre;
                           bodega9[x][1] = stock;
                           bodega9[x][2] = precio;
                           bodega9[x][3] = categoria;
                           break; }}
                break;
            }
            default:{
                System.out.println("el numero de bodega no existe");
                break;
            }
        }
        cargarBodegas();
      }
  public static int getOtroBo(String p){

      Scanner dato = new Scanner(System.in);
      String s1 = "";
      while(s1.equals("")){
          System.out.println(p);
          s1 = dato.nextLine();
         try{
             int d = Integer.parseInt(s1);
         }
         catch(Exception e){
             s1 = "";
         
         }
      }
      return Integer.parseInt(s1);
  }
  public static int getOtroL(String dato){
     Scanner datos = new Scanner(System.in);
      String s1 = "";
      while(s1.equals("")){
          System.out.println(dato);
          s1 = datos.nextLine();
         try{
             int d = Integer.parseInt(s1);
         }
         catch(Exception e){
             s1 = "";
         
         }
      }
      return Integer.parseInt(s1);
  }
  public static float getOtroP(String dato){
     Scanner datoss = new Scanner(System.in);
      String s1 = "";
      while(s1.equals("")){
          System.out.println(dato);
          s1 = datoss.nextLine();
         try{
             int d = Integer.parseInt(s1);
         }
         catch(Exception e){
             s1 = "";
         
         }
      }
      
      return Float.parseFloat(s1);
  }
  public static void imprimirBodegas(){
       System.out.println("");
         System.out.println("**************************************************");
        System.out.println("                   *INVENTARIO*                    ");
        System.out.println("***************************************************");
        System.out.println("BODEGA 0");
        for(int x =0; x<bodega.length; x++){
                if(bodega[x][0] != null && bodega[x][1] != null ){
                       System.out.println("Producto        Existencia     Precio        Categoria");
                       System.out.println(bodega[x][0] + "          " + bodega[x][1] + "               "
                       + bodega[x][2] + "           " + bodega[x][3]);
                } }
        System.out.println("**************************************************");
        System.out.println("BODEGA 1");
        for(int x =0; x<bodega1.length; x++){
                if(bodega1[x][0] != null && bodega1[x][1] != null ){
                       System.out.println("Producto        Existencia     Precio        Categoria");
                       System.out.println(bodega1[x][0] + "          " + bodega1[x][1] + "            "
                       + bodega1[x][2] + "          " + bodega1[x][3]);
                } } 
        System.out.println("**************************************************");
        System.out.println("BODEGA 2");
        for(int x =0; x<bodega2.length; x++){
                if(bodega2[x][0] != null && bodega2[x][1] != null ){
                       System.out.println("Producto        Existencia     Precio        Categoria");
                       System.out.println(bodega2[x][0] + "          " + bodega2[x][1] + "            "
                       + bodega2[x][2] + "          " + bodega2[x][3]);
                } } 
        System.out.println("**************************************************");
        System.out.println("BODEGA 3");
        for(int x =0; x<bodega3.length; x++){
                if(bodega3[x][0] != null && bodega3[x][1] != null ){
                       System.out.println("Producto        Existencia     Precio        Categoria");
                       System.out.println(bodega3[x][0] + "          " + bodega3[x][1] + "            "
                       + bodega3[x][2] + "          " + bodega3[x][3]);
                } }
        System.out.println("**************************************************");
        System.out.println("BODEGA 4");
        for(int x =0; x<bodega4.length; x++){
                if(bodega4[x][0] != null && bodega4[x][1] != null ){
                       System.out.println("Producto        Existencia     Precio        Categoria");
                       System.out.println(bodega4[x][0] + "          " + bodega4[x][1] + "            "
                       + bodega4[x][2] + "          " + bodega4[x][3]);
                } } 
        System.out.println("**************************************************");
        System.out.println("BODEGA 5");
        for(int x =0; x<bodega5.length; x++){
                if(bodega5[x][0] != null && bodega5[x][1] != null ){
                       System.out.println("Producto        Existencia     Precio        Categoria");
                       System.out.println(bodega5[x][0] + "          " + bodega5[x][1] + "            "
                       + bodega5[x][2] + "          " + bodega5[x][3]);
                } }
        System.out.println("**************************************************");
        System.out.println("BODEGA 6");
        for(int x =0; x<bodega6.length; x++){
                if(bodega6[x][0] != null && bodega6[x][1] != null ){
                       System.out.println("Producto        Existencia     Precio        Categoria");
                       System.out.println(bodega6[x][0] + "          " + bodega6[x][1] + "            "
                       + bodega6[x][2] + "          " + bodega6[x][3]);
                } }
        System.out.println("**************************************************");
        System.out.println("BODEGA 7");
        for(int x =0; x<bodega7.length; x++){
                if(bodega7[x][0] != null && bodega7[x][1] != null ){
                       System.out.println("Producto        Existencia     Precio        Categoria");
                       System.out.println(bodega7[x][0] + "          " + bodega7[x][1] + "            "
                       + bodega7[x][2] + "          " + bodega7[x][3]);
                } }
        System.out.println("**************************************************");
        System.out.println("BODEGA 8");
        for(int x =0; x<bodega8.length; x++){
                if(bodega8[x][0] != null && bodega8[x][1] != null ){
                       System.out.println("Producto        Existencia     Precio        Categoria");
                       System.out.println(bodega8[x][0] + "          " + bodega8[x][1] + "            "
                       + bodega8[x][2] + "          " + bodega8[x][3]);
                } }
        System.out.println("**************************************************");
        System.out.println("BODEGA 9");
        for(int x =0; x<bodega9.length; x++){
                if(bodega9[x][0] != null && bodega9[x][1] != null ){
                       System.out.println("Producto        Existencia     Precio        Categoria");
                       System.out.println(bodega9[x][0] + "          " + bodega9[x][1] + "            "
                       + bodega9[x][2] + "          " + bodega9[x][3]);
                } }
        
        
   }
  public static void agregarProductosCargaMasiva(){
      System.out.println("");
        System.out.println("Ingrese la carga masiva de los datos que desea agregar");
        int noBode;
        String noBodeM;
        String bodegas = getString();
        try{
        String [] matrizUno = bodegas.split("\\$");
        
         for(int i=0; i<matrizUno.length; i++){
             String bodeega = matrizUno[i];
             String [] atributo = bodeega.split(";");
             noBodeM = atributo[0];
             noBode = Integer.parseInt(noBodeM);
             switch(noBode - 1){
                 case 0:{ 
                       for(int x=0; x<bodega.length; x++){
                       if(bodega[x][0] == null && bodega[x][1] == null){
                           bodega[x][0] = atributo[1];
                           bodega[x][1] = atributo[2];
                           bodega[x][2] = atributo[3];
                           bodega[x][3] = atributo[4];
                           break;
                   }} 
                     break; // break del switch case
                 }// aqui termina el case  
                  case 1:{ 
                       for(int x=0; x<bodega1.length; x++){
                       if(bodega1[x][0] == null && bodega1[x][1] == null){
                           bodega1[x][0] = atributo[1];
                           bodega1[x][1] = atributo[2];
                           bodega1[x][2] = atributo[3];
                           bodega1[x][3] = atributo[4];
                           break;
                   }} 
                     break; // break del switch case
                 }// aqui termina el case 
                  case 2:{ 
                       for(int x=0; x<bodega2.length; x++){
                       if(bodega2[x][0] == null && bodega2[x][1] == null){
                           bodega2[x][0] = atributo[1];
                           bodega2[x][1] = atributo[2];
                           bodega2[x][2] = atributo[3];
                           bodega2[x][3] = atributo[4];
                           break;
                   }} 
                     break; // break del switch case
                 }// aqui termina el case 
                  case 3:{ 
                       for(int x=0; x<bodega3.length; x++){
                       if(bodega3[x][0] == null && bodega3[x][1] == null){
                           bodega3[x][0] = atributo[1];
                           bodega3[x][1] = atributo[2];
                           bodega3[x][2] = atributo[3];
                           bodega3[x][3] = atributo[4];
                           break;
                   }} 
                     break; // break del switch case
                 }// aqui termina el case 
                  case 4:{ 
                       for(int x=0; x<bodega4.length; x++){
                       if(bodega4[x][0] == null && bodega4[x][1] == null){
                           bodega4[x][0] = atributo[1];
                           bodega4[x][1] = atributo[2];
                           bodega4[x][2] = atributo[3];
                           bodega4[x][3] = atributo[4];
                           break;
                   }} 
                     break; // break del switch case
                 }// aqui termina el case 
                  case 5:{ 
                       for(int x=0; x<bodega5.length; x++){
                       if(bodega5[x][0] == null && bodega5[x][1] == null){
                           bodega5[x][0] = atributo[1];
                           bodega5[x][1] = atributo[2];
                           bodega5[x][2] = atributo[3];
                           bodega5[x][3] = atributo[4];
                           break;
                   }} 
                     break; // break del switch case
                 }// aqui termina el case 
                  case 6:{ 
                       for(int x=0; x<bodega6.length; x++){
                       if(bodega6[x][0] == null && bodega6[x][1] == null){
                           bodega6[x][0] = atributo[1];
                           bodega6[x][1] = atributo[2];
                           bodega6[x][2] = atributo[3];
                           bodega6[x][3] = atributo[4];
                           break;
                   }} 
                     break; // break del switch case
                 }// aqui termina el case
                  case 7:{ 
                       for(int x=0; x<bodega7.length; x++){
                       if(bodega7[x][0] == null && bodega7[x][1] == null){
                           bodega7[x][0] = atributo[1];
                           bodega7[x][1] = atributo[2];
                           bodega7[x][2] = atributo[3];
                           bodega7[x][3] = atributo[4];
                           break;
                   }} 
                     break; // break del switch case
                 }// aqui termina el case 
                  case 8:{ 
                       for(int x=0; x<bodega8.length; x++){
                       if(bodega8[x][0] == null && bodega8[x][1] == null){
                           bodega8[x][0] = atributo[1];
                           bodega8[x][1] = atributo[2];
                           bodega8[x][2] = atributo[3];
                           bodega8[x][3] = atributo[4];
                           break;
                   }} 
                     break; // break del switch case
                 }// aqui termina el case 
                  case 9:{ 
                       for(int x=0; x<bodega9.length; x++){
                       if(bodega9[x][0] == null && bodega9[x][1] == null){
                           bodega9[x][0] = atributo[1];
                           bodega9[x][1] = atributo[2];
                           bodega9[x][2] = atributo[3];
                           bodega9[x][3] = atributo[4];
                           break;
                   }} 
                     break; // break del switch case
                 }// aqui termina el case 
             }//aqui termina el switch
          
         }
            cargarBodegas();
        }catch(Exception e){
            System.out.println("Carga Masiva incorrecta");
            cargarBodegas();
        }
  }
  public static String getOtroo(String uno){
      Scanner dato = new Scanner(System.in);
      String s1 = "";
      while(s1.equals("")){
          System.out.println(uno);
          s1 = dato.nextLine();
          if(!s1.matches("[0-9]")){
              s1 = "";
          }
      }
      return s1;
  }
  public static double getOtroPP(String dato){
     Scanner datoss = new Scanner(System.in);
      String s1 = "";
      while(s1.equals("")){
          System.out.println(dato);
          s1 = datoss.nextLine();
         try{
             int d = Integer.parseInt(s1);
         }
         catch(Exception e){
             s1 = "";
         
         }
      }
      
      return Double.parseDouble(s1);
  }
  public static String getOtroStock(String dato){
     Scanner datos = new Scanner(System.in);
      String s1 = "";
      while(s1.equals("")){
          System.out.println(dato);
          s1 = datos.nextLine();
         try{
             int d = Integer.parseInt(s1);
         }
         catch(Exception e){
             s1 = "";
         
         }
      }
      return s1;
  }
  public static void inventario(){
     
      System.out.println("Ingrese el número de bodega que desea imprimir");
      String noBodega = getOtroo("[para regresar al menu presione cualquier letra seguida de enter]");
      switch(Integer.parseInt(noBodega)){
          case 0:{
               System.out.println("");
         System.out.println("**************************************************");
        System.out.println("                   *INVENTARIO*                    ");
        System.out.println("***************************************************");
        System.out.println("BODEGA 0");
        for(int x =0; x<bodega.length; x++){
                if(bodega[x][0] != null && bodega[x][1] != null ){
                       System.out.println("Producto        Existencia     Precio        Categoria");
                       System.out.println(bodega[x][0] + "          " + bodega[x][1] + "               "
                       + bodega[x][2] + "           " + bodega[x][3]);
                } }
         break; }//aqui termina el case
          case 1 :{
               System.out.println("**************************************************");
        System.out.println("BODEGA 1");
        for(int x =0; x<bodega1.length; x++){
                if(bodega1[x][0] != null && bodega1[x][1] != null ){
                       System.out.println("Producto        Existencia     Precio        Categoria");
                       System.out.println(bodega1[x][0] + "          " + bodega1[x][1] + "            "
                       + bodega1[x][2] + "          " + bodega1[x][3]);
                } } 
             break; 
          }//aqui termina el case
             case 2 :{
                  System.out.println("**************************************************");
        System.out.println("BODEGA 2");
        for(int x =0; x<bodega2.length; x++){
                if(bodega2[x][0] != null && bodega2[x][1] != null ){
                       System.out.println("Producto        Existencia     Precio        Categoria");
                       System.out.println(bodega2[x][0] + "          " + bodega2[x][1] + "            "
                       + bodega2[x][2] + "          " + bodega2[x][3]);
                } } 
             break; 
          }//aqui termina el case
                  case 3 :{
                       System.out.println("**************************************************");
        System.out.println("BODEGA 3");
        for(int x =0; x<bodega3.length; x++){
                if(bodega3[x][0] != null && bodega3[x][1] != null ){
                       System.out.println("Producto        Existencia     Precio        Categoria");
                       System.out.println(bodega3[x][0] + "          " + bodega3[x][1] + "            "
                       + bodega3[x][2] + "          " + bodega3[x][3]);
                } }
             break; 
          }//aqui termina el case
                  case 4 :{
                       System.out.println("**************************************************");
        System.out.println("BODEGA 4");
        for(int x =0; x<bodega4.length; x++){
                if(bodega4[x][0] != null && bodega4[x][1] != null ){
                       System.out.println("Producto        Existencia     Precio        Categoria");
                       System.out.println(bodega4[x][0] + "          " + bodega4[x][1] + "            "
                       + bodega4[x][2] + "          " + bodega4[x][3]);
                } } 
                      
             break; 
          }//aqui termina el case
                  case 5 :{
                      System.out.println("BODEGA 5");
        for(int x =0; x<bodega5.length; x++){
                if(bodega5[x][0] != null && bodega5[x][1] != null ){
                       System.out.println("Producto        Existencia     Precio        Categoria");
                       System.out.println(bodega5[x][0] + "          " + bodega5[x][1] + "            "
                       + bodega5[x][2] + "          " + bodega5[x][3]);
                } }
             break; 
          }//aqui termina el case
                  case 6 :{
                       System.out.println("**************************************************");
        System.out.println("BODEGA 6");
        for(int x =0; x<bodega6.length; x++){
                if(bodega6[x][0] != null && bodega6[x][1] != null ){
                       System.out.println("Producto        Existencia     Precio        Categoria");
                       System.out.println(bodega6[x][0] + "          " + bodega6[x][1] + "            "
                       + bodega6[x][2] + "          " + bodega6[x][3]);
                } }
             break; 
          }//aqui termina el case
                  case 7 :{
                       System.out.println("**************************************************");
        System.out.println("BODEGA 7");
        for(int x =0; x<bodega7.length; x++){
                if(bodega7[x][0] != null && bodega7[x][1] != null ){
                       System.out.println("Producto        Existencia     Precio        Categoria");
                       System.out.println(bodega7[x][0] + "          " + bodega7[x][1] + "            "
                       + bodega7[x][2] + "          " + bodega7[x][3]);
                } }
             break; 
          }//aqui termina el case
                  case 8 :{
                       System.out.println("**************************************************");
        System.out.println("BODEGA 8");
        for(int x =0; x<bodega8.length; x++){
                if(bodega8[x][0] != null && bodega8[x][1] != null ){
                       System.out.println("Producto        Existencia     Precio        Categoria");
                       System.out.println(bodega8[x][0] + "          " + bodega8[x][1] + "            "
                       + bodega8[x][2] + "          " + bodega8[x][3]);
                } }
             break; 
          }//aqui termina el case
                  case 9 :{
                      System.out.println("**************************************************");
        System.out.println("BODEGA 9");
        for(int x =0; x<bodega9.length; x++){
                if(bodega9[x][0] != null && bodega9[x][1] != null ){
                       System.out.println("Producto        Existencia     Precio        Categoria");
                       System.out.println(bodega9[x][0] + "          " + bodega9[x][1] + "            "
                       + bodega9[x][2] + "          " + bodega9[x][3]);
                } }
             break; 
          }//aqui termina el case
                  default:{
                      menuBodega();
                      break;
      }
      }menuBodega();
      
  }
  public static int getIn(String arg){
      Scanner dato5 = new Scanner(System.in);
      String s6 = "";
      while(s6.equals("")){
          System.out.println(arg);
          s6 = dato5.nextLine();
          if(!s6.matches("[0]")){
              s6 = "";
          }
      }
      return Integer.parseInt(s6);
  }
  public static void modificar(){
      imprimirBodegas();
     
        System.out.println("Ingrese el número de la bodega que desea modificar");
        String posicion;
        posicion = getOtroo("[debe ingresar un número del 0 al 9 si no deberá ingresar el númeor nuevamente]");
        System.out.println("Ingrese el nombre del producto que desea ingresar");
        String nombreProducto = getString();
        switch(Integer.parseInt(posicion)){
            case 0:{
                System.out.println("Ingrese el número de stock que desea agregar o quitar del producto");
                int agregarStock = getOtroL("[debe de ingresar una cantidad valida para modificar el stock]");
                for(int y=0; y<25; y++){
                for(int x=0; x<bodega.length; x++){
                   try{ if(bodega[x][0].equals(nombreProducto)){
                        bodega[x][1] = Integer.toString((Integer.valueOf((String)bodega[x][1]))+ agregarStock);
                   } } 
                   catch(Exception e){
                       int seleccion = getIn("[debe regresar al menú de bodegas presione 0 seguido de enter]");
                       if(seleccion == 0){
                     menuBodega();
                       break;
                   }}//aqui termina el for
            }}}//aqui termina el case
            case 1:{
                System.out.println("Ingrese el número de stock que desea agregar o quitar del producto");
                int agregarStock = getOtroL("[debe de ingresar una cantidad valida para modificar el stock]");
                for(int y=0; y<25; y++){
                for(int x=0; x<bodega1.length; x++){
                   try{ if(bodega1[x][0].equals(nombreProducto)){
                        bodega1[x][1] = Integer.toString((Integer.valueOf((String)bodega1[x][1]))+ agregarStock);
                   } } 
                   catch(Exception e){
                       int seleccion = getIn("[debe regresar al menú de bodegas presione 0 seguido de enter]");
                       if(seleccion == 0){
                     menuBodega();
                       break;
                   }}//aqui termina el for
            }}}//aqui termina el case
             case 2:{
                System.out.println("Ingrese el número de stock que desea agregar o quitar del producto");
                int agregarStock = getOtroL("[debe de ingresar una cantidad valida para modificar el stock]");
                for(int y=0; y<25; y++){
                for(int x=0; x<bodega2.length; x++){
                   try{ if(bodega2[x][0].equals(nombreProducto)){
                        bodega2[x][1] = Integer.toString((Integer.valueOf((String)bodega2[x][1]))+ agregarStock);
                   } } 
                   catch(Exception e){
                       int seleccion = getIn("[debe regresar al menú de bodegas presione 0 seguido de enter]");
                       if(seleccion == 0){
                     menuBodega();
                       break;
                   }}//aqui termina el for
            }}}//aqui termina el case
             case 3:{
                System.out.println("Ingrese el número de stock que desea agregar o quitar del producto");
                int agregarStock = getOtroL("[debe de ingresar una cantidad valida para modificar el stock]");
                for(int y=0; y<25; y++){
                for(int x=0; x<bodega3.length; x++){
                   try{ if(bodega3[x][0].equals(nombreProducto)){
                        bodega3[x][1] = Integer.toString((Integer.valueOf((String)bodega3[x][1]))+ agregarStock);
                   } } 
                   catch(Exception e){
                       int seleccion = getIn("[debe regresar al menú de bodegas presione 0 seguido de enter]");
                       if(seleccion == 0){
                     menuBodega();
                       break;
                   }}//aqui termina el for
            }}}//aqui termina el case
            
              case 4:{
                System.out.println("Ingrese el número de stock que desea agregar o quitar del producto");
                int agregarStock = getOtroL("[debe de ingresar una cantidad valida para modificar el stock]");
                for(int y=0; y<25; y++){
                for(int x=0; x<bodega4.length; x++){
                   try{ if(bodega4[x][0].equals(nombreProducto)){
                        bodega4[x][1] = Integer.toString((Integer.valueOf((String)bodega4[x][1]))+ agregarStock);
                   } } 
                   catch(Exception e){
                       int seleccion = getIn("[debe regresar al menú de bodegas presione 0 seguido de enter]");
                       if(seleccion == 0){
                     menuBodega();
                       break;
                   }}//aqui termina el for
            }}}//aqui termina el case
              
               case 5:{
                System.out.println("Ingrese el número de stock que desea agregar o quitar del producto");
                int agregarStock = getOtroL("[debe de ingresar una cantidad valida para modificar el stock]");
                for(int y=0; y<25; y++){
                for(int x=0; x<bodega5.length; x++){
                   try{ if(bodega5[x][0].equals(nombreProducto)){
                        bodega5[x][1] = Integer.toString((Integer.valueOf((String)bodega5[x][1]))+ agregarStock);
                   } } 
                   catch(Exception e){
                       int seleccion = getIn("[debe regresar al menú de bodegas presione 0 seguido de enter]");
                       if(seleccion == 0){
                     menuBodega();
                       break;
                   }}//aqui termina el for
            }}}//aqui termina el case
              
                case 6:{
                System.out.println("Ingrese el número de stock que desea agregar o quitar del producto");
                int agregarStock = getOtroL("[debe de ingresar una cantidad valida para modificar el stock]");
                for(int y=0; y<25; y++){
                for(int x=0; x<bodega6.length; x++){
                   try{ if(bodega6[x][0].equals(nombreProducto)){
                        bodega6[x][1] = Integer.toString((Integer.valueOf((String)bodega6[x][1]))+ agregarStock);
                   } } 
                   catch(Exception e){
                       int seleccion = getIn("[debe regresar al menú de bodegas presione 0 seguido de enter]");
                       if(seleccion == 0){
                     menuBodega();
                       break;
                   }}//aqui termina el for
            }}}//aqui termina el case
                 case 7:{
                System.out.println("Ingrese el número de stock que desea agregar o quitar del producto");
                int agregarStock = getOtroL("[debe de ingresar una cantidad valida para modificar el stock]");
                for(int y=0; y<25; y++){
                for(int x=0; x<bodega7.length; x++){
                   try{ if(bodega7[x][0].equals(nombreProducto)){
                        bodega7[x][1] = Integer.toString((Integer.valueOf((String)bodega7[x][1]))+ agregarStock);
                   } } 
                   catch(Exception e){
                       int seleccion = getIn("[debe regresar al menú de bodegas presione 0 seguido de enter]");
                       if(seleccion == 0){
                     menuBodega();
                       break;
                   }}//aqui termina el for
            }}}//aqui termina el case
                 case 8:{
                System.out.println("Ingrese el número de stock que desea agregar o quitar del producto");
                int agregarStock = getOtroL("[debe de ingresar una cantidad valida para modificar el stock]");
                for(int y=0; y<25; y++){
                for(int x=0; x<bodega8.length; x++){
                   try{ if(bodega8[x][0].equals(nombreProducto)){
                        bodega8[x][1] = Integer.toString((Integer.valueOf((String)bodega8[x][1]))+ agregarStock);
                   } } 
                   catch(Exception e){
                       int seleccion = getIn("[debe regresar al menú de bodegas presione 0 seguido de enter]");
                       if(seleccion == 0){
                     menuBodega();
                       break;
                   }}//aqui termina el for
            }}}//aqui termina el case
                  case 9:{
                System.out.println("Ingrese el número de stock que desea agregar o quitar del producto");
                int agregarStock = getOtroL("[debe de ingresar una cantidad valida para modificar el stock]");
                for(int y=0; y<25; y++){
                for(int x=0; x<bodega9.length; x++){
                   try{ if(bodega9[x][0].equals(nombreProducto)){
                        bodega9[x][1] = Integer.toString((Integer.valueOf((String)bodega9[x][1]))+ agregarStock);
                   } } 
                   catch(Exception e){
                       int seleccion = getIn("[debe regresar al menú de bodegas presione 0 seguido de enter]");
                       if(seleccion == 0){
                     menuBodega();
                       break;
                   }}//aqui termina el for
            }}}//aqui termina el case
                 
    }//aqui termina el switch
    int seleccion = getIn("[para regresar al menú de bodegas presione 0 seguido de enter ]");
      if(seleccion == 0){
          menuBodega();
      }
  }
  public static void accionesTraslado(){
     int escogert;
      escogert = getOtrot("[Advertencia]: (Si ingresa un valor diferente a los asignados para cada acción \nusted deberá ingresar el número de accion nuevamente hasta que escoja uno correcto)");
       switch (escogert) {
              case 1:{ 
                traslados();
                menuTraslado();
                  break;}
              case 2:{ 
                  menuPrincipal();
                  break;}
             
              
  } 
  }
  public static int getOtrot(String uno){
      Scanner dato = new Scanner(System.in);
      String s1 = "";
      while(s1.equals("")){
          System.out.println(uno);
          s1 = dato.nextLine();
          if(!s1.matches("[1-2]")){
              s1 = "";
              menuPrincipal();
          }
      }
      return Integer.parseInt(s1);
  }
  public static void reporteStock(){
      System.out.println("");
      String stockR = getOtroStock("Ingrese el número de stock de los productos que desea buscar");
      System.out.println("STOCK INGRESADO:" + "[" + stockR  + "]");
              System.out.println("*************************");
              System.out.println("**RODUCTOS EN BODEGA 0**");
       try{ for(int y =0; y<25; y++){
          for(int x=0; x<25; x++){
          if(((String)bodega[x][1]).equals(stockR)){
              System.out.println("[" + bodega[x][0] + "]");    
      }}}}
       catch(Exception e){
               System.out.println("*************************");
              System.out.println("**RODUCTOS EN BODEGA 1**");
      try{ for(int y =0; y<25; y++){
          for(int x=0; x<25; x++){
          if(((String)bodega1[x][1]).equals(stockR)){
              System.out.println("[" + bodega1[x][0] + "]");
      }}}}
      catch(Exception f){
           System.out.println("*************************");
              System.out.println("**RODUCTOS EN BODEGA 2**");
      try{ for(int y =0; y<25; y++){
          for(int x=0; x<25; x++){
          if(((String)bodega2[x][1]).equals(stockR)){
              System.out.println("[" + bodega2[x][0] + "]");
      }}}} 
      catch(Exception g){
          System.out.println("*************************");
              System.out.println("**RODUCTOS EN BODEGA 3**");
      try{ for(int y =0; y<25; y++){
          for(int x=0; x<25; x++){
          if(((String)bodega3[x][1]).equals(stockR)){
              System.out.println("[" + bodega3[x][0] + "]");
      }}}}
      catch(Exception h){
          System.out.println("*************************");
              System.out.println("**RODUCTOS EN BODEGA 4**");
      try{ for(int y =0; y<25; y++){
          for(int x=0; x<25; x++){
          if(((String)bodega4[x][1]).equals(stockR)){
              System.out.println("[" + bodega4[x][0] + "]");
      }}}}
      catch(Exception i){
           System.out.println("*************************");
              System.out.println("**RODUCTOS EN BODEGA 5**");
      try {for(int y =0; y<25; y++){
          for(int x=0; x<25; x++){
          if(((String)bodega5[x][1]).equals(stockR)){
              System.out.println("[" + bodega5[x][0] + "]");
      }}}}
      catch(Exception j){
          System.out.println("*************************");
              System.out.println("**RODUCTOS EN BODEGA 6**");
      try{ for(int y =0; y<25; y++){
          for(int x=0; x<25; x++){
          if(((String)bodega6[x][1]).equals(stockR)){
              System.out.println("[" + bodega6[x][0] + "]");
      }}}} 
      catch(Exception k){
          System.out.println("*************************");
              System.out.println("**RODUCTOS EN BODEGA 7**");
      try {for(int y =0; y<25; y++){
          for(int x=0; x<25; x++){
          if(((String)bodega7[x][1]).equals(stockR)){
              System.out.println("[" + bodega7[x][0] + "]");
      }}}}
      catch(Exception l){
          System.out.println("*************************");
              System.out.println("**RODUCTOS EN BODEGA 8**");
      try {for(int y =0; y<25; y++){
          for(int x=0; x<25; x++){
          if(((String)bodega8[x][1]).equals(stockR)){
              System.out.println("[" + bodega8[x][0] + "]");
      }}}}
      catch(Exception m){
       System.out.println("*************************");
              System.out.println("**RODUCTOS EN BODEGA 9**");
      try{for(int y =0; y<25; y++){
          for(int x=0; x<25; x++){
          if(((String)bodega9[x][1]).equals(stockR)){
              System.out.println("[" + bodega9[x][0] + "]");
      }}}}
      catch(Exception n){
          menuReportes();
      }
      }
      }
      }
      }
      }
      }
      } 
      }
      }

  }
  public static void regresar(){
      int seleccion = getIn("[para regresar al menú de reportes presione 0 seguido de enter]");
                       if(seleccion == 0){
                     menuReportes();
                       }
  }
  public static void traslados(){
        System.out.println("Ingrese el nombre de bodega de origen");
        String origen = getOtroo(".............");
        System.out.println("Ingrse el nombre de bodega de desitno");
        String destino = getOtroo("..........");
        System.out.println("Ingrese el nombre del articulo que desea trasladar");
        String articulo = getString();
        System.out.println("Ingrese el stock del articulo que desea trasladar");
        int cantidad = getOtroL("...");
        System.out.println("Bodega de origen:" + origen);
        System.out.println("Bodega de destino:" + destino);
        System.out.println("Producto:" + articulo);
        System.out.println("Cantidad:" + cantidad);
        switch(Integer.parseInt(origen)){
            case 0:{
              try{  for(int y=0; y<25; y++){
                for(int x=0; x<25;x++){
                    if(bodega[x][0].equals(articulo)){
                        bodega[x][1] = Integer.toString(Integer.valueOf((String)bodega[x][1]) - cantidad);
                                                sumar(Integer.parseInt(destino), articulo, cantidad);
                        
                    }
                }}}catch(Exception e){
                    menuTraslado();
                }
            }//aqui termina el case
              case 1:{
              try{  for(int y=0; y<25; y++){
                for(int x=0; x<25;x++){
                    if(bodega1[x][0].equals(articulo)){
                        bodega1[x][1] = Integer.toString(Integer.valueOf((String)bodega1[x][1]) - cantidad);
                                                 sumar(Integer.parseInt(destino), articulo, cantidad);
                    }
                }}}catch(Exception e){
                    menuTraslado();
                }
            }//aqui termina el case
              case 2:{
              try{  for(int y=0; y<25; y++){
                for(int x=0; x<25;x++){
                    if(bodega2[x][0].equals(articulo)){
                        bodega2[x][1] = Integer.toString(Integer.valueOf((String)bodega2[x][1]) - cantidad);
                                                 sumar(Integer.parseInt(destino), articulo, cantidad);
                    }
                }}}catch(Exception e){
                    menuTraslado();
                }
            }//aqui termina el case
             case 3:{
              try{  for(int y=0; y<25; y++){
                for(int x=0; x<25;x++){
                    if(bodega3[x][0].equals(articulo)){
                        bodega3[x][1] = Integer.toString(Integer.valueOf((String)bodega3[x][1]) - cantidad);
                                                 sumar(Integer.parseInt(destino), articulo, cantidad);
                    }
                }}}catch(Exception e){
                    menuTraslado();
                }
            }//aqui termina el case
             case 4:{
              try{  for(int y=0; y<25; y++){
                for(int x=0; x<25;x++){
                    if(bodega4[x][0].equals(articulo)){
                        bodega4[x][1] = Integer.toString(Integer.valueOf((String)bodega4[x][1]) - cantidad);
                                         sumar(Integer.parseInt(destino), articulo, cantidad);
                    }
                }}}catch(Exception e){
                    menuTraslado();
                }
            }//aqui termina el case
             case 5:{
              try{  for(int y=0; y<25; y++){
                for(int x=0; x<25;x++){
                    if(bodega5[x][0].equals(articulo)){
                        bodega5[x][1] = Integer.toString(Integer.valueOf((String)bodega5[x][1]) - cantidad);
                         sumar(Integer.parseInt(destino), articulo, cantidad);
                    }
                }}}catch(Exception e){
                    menuTraslado();
                }
            }//aqui termina el case
             case 6:{
              try{  for(int y=0; y<25; y++){
                for(int x=0; x<25;x++){
                    if(bodega6[x][0].equals(articulo)){
                        bodega6[x][1] = Integer.toString(Integer.valueOf((String)bodega6[x][1]) - cantidad);
                          sumar(Integer.parseInt(destino), articulo, cantidad);
                    }
                }}}catch(Exception e){
                    menuTraslado();
                }
            }//aqui termina el case
             case 7:{
              try{  for(int y=0; y<25; y++){
                for(int x=0; x<25;x++){
                    if(bodega7[x][0].equals(articulo)){
                        bodega7[x][1] = Integer.toString(Integer.valueOf((String)bodega7[x][1]) - cantidad);
                          sumar(Integer.parseInt(destino), articulo, cantidad);
                    }
                }}}catch(Exception e){
                    menuTraslado();
                }
            }//aqui termina el case
             case 8:{
              try{  for(int y=0; y<25; y++){
                for(int x=0; x<25;x++){
                    if(bodega8[x][0].equals(articulo)){
                        bodega8[x][1] = Integer.toString(Integer.valueOf((String)bodega8[x][1]) - cantidad);
                         sumar(Integer.parseInt(destino), articulo, cantidad);
                    }
                }}}catch(Exception e){
                    menuTraslado();
                }
            }//aqui termina el case
             case 9:{
              try{  for(int y=0; y<25; y++){
                for(int x=0; x<25;x++){
                    if(bodega9[x][0].equals(articulo)){
                        bodega9[x][1] = Integer.toString(Integer.valueOf((String)bodega9[x][1]) - cantidad);
                        sumar(Integer.parseInt(destino), articulo, cantidad);
                    }
                }}}catch(Exception e){
                    menuTraslado();
                }
            }//aqui termina el case
        }
        
        
    }
  public static void sumar(int destino, String producto, int cantidad){
      switch(destino){
          case 1:{
              for(int y=0; y<25;y++){
                  for(int x=0; x<25;x++){
                      if(bodega1[x][0].equals(producto)){
                          bodega1[x][1] = (Integer.valueOf((String)bodega1[x][1]) + cantidad);
                      }
                  }
              }
          }//case
            case 2:{
              for(int y=0; y<25;y++){
                  for(int x=0; x<25;x++){
                      if(bodega2[x][0].equals(producto)){
                          bodega2[x][1] = (Integer.valueOf((String)bodega2[x][1]) + cantidad);
                      }
                  }
              }
          }//case
           case 3:{
              for(int y=0; y<25;y++){
                  for(int x=0; x<25;x++){
                      if(bodega3[x][0].equals(producto)){
                          bodega3[x][1] = (Integer.valueOf((String)bodega3[x][1]) + cantidad);
                      }
                  }
              }
          }//case
            case 4:{
              for(int y=0; y<25;y++){
                  for(int x=0; x<25;x++){
                      if(bodega4[x][0].equals(producto)){
                          bodega4[x][1] = (Integer.valueOf((String)bodega4[x][1]) + cantidad);
                      }
                  }
              }
          }//case
             case 5:{
              for(int y=0; y<25;y++){
                  for(int x=0; x<25;x++){
                      if(bodega5[x][0].equals(producto)){
                          bodega5[x][1] = (Integer.valueOf((String)bodega5[x][1]) + cantidad);
                      }
                  }
              }
          }//case
              case 6:{
              for(int y=0; y<25;y++){
                  for(int x=0; x<25;x++){
                      if(bodega6[x][0].equals(producto)){
                          bodega6[x][1] = (Integer.valueOf((String)bodega6[x][1]) + cantidad);
                      }
                  }
              }
          }//case
               case 7:{
              for(int y=0; y<25;y++){
                  for(int x=0; x<25;x++){
                      if(bodega7[x][0].equals(producto)){
                          bodega7[x][1] = (Integer.valueOf((String)bodega7[x][1]) + cantidad);
                      }
                  }
              }
          }//case
                case 8:{
              for(int y=0; y<25;y++){
                  for(int x=0; x<25;x++){
                      if(bodega8[x][0].equals(producto)){
                          bodega8[x][1] = (Integer.valueOf((String)bodega8[x][1]) + cantidad);
                      }
                  }
              }
          }//case
                 case 9:{
              for(int y=0; y<25;y++){
                  for(int x=0; x<25;x++){
                      if(bodega9[x][0].equals(producto)){
                          bodega9[x][1] = (Integer.valueOf((String)bodega9[x][1]) + cantidad);
                      }
                  }
              }
          }//case
      }
      
  }
}

      
       

  