API RESTful de Recetator 3000
============================

Escrito por : Juan Luis Pérez

1. Instalar eclipse KEPLER para JAVA

2. Clonar el repositorio 
2.1 File --> Import --> Git --> Proyects for Git
Añadir la URI https://github.com/plandevida/Recetator3000_api.git y vuestros datos de acceso.

3. Compilar y resolver dependencias.
Para ello , ir a las propiedades del proyecto y eliminar las librerias problematicas.
Se redescargarán al hacer MAVEN INSTALL


4. Para poder 'compilar' por así decirlo , se usa el MAVEN con la opción install.
Seleccionar RUN AS-> MAVEN INSTALL 

5. Para lanzar el servidor local para probar , se lanza en Run Configurations como Web Service.

6. Importante USAR GIT : Una vez realizados cambios que podamos considerar como significativos , subirlos realizando un COMMIT ( subir dichos cambios en local )
y PUSH ( reflejar dichos cambios en el servidor de GIT)

7. Si pensamos que nuestra APP está estable y queremos subirla al server de GOOGLE ( usar plugin repositorio para  eclipse) https://dl.google.com/eclipse/plugin/4.3 )
Click derecho en el proyecto -> Google -> Deploy to APP Engine y seguir instrucciones. 
Comprobar en http://recetator-api.appspot.com que realmente se han reflejado los cambos


Descripción de algunos de los ficheros
-----------------------------------------
Código JAVA en SRC/MAIN/JAVA/RECETATORAPI

pow.xml , build.xml --> Opciones del proyecto maven , dependencias y demás . No debería ser necesario tocarlos


src --> Aquí esta el codigo HTML y los archivos de configuración del servidor Web.
--> importante web.xml donde se realiza el mapeo de las páginas a los servlet.

target --> aqui es donde una vez 'compilado' se guardará la instancia local de la aplicación.


