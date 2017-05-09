#include <stdio.h>
#include <windows.h>

int main()
{
struct grupo{
    int Id;
    char *nombre[20];
    char *apellido[30];
    char *Carrera[30];
    char *Genero[15];
    int Telefono[10];
	int participaciones ;
}alumno;

int opc;
   do{
        system("cls");
        printf("\tSelecciona una opcion del menu\n");
        printf("1-Llena el registro del alumno\n");
        printf("2-Muestra el registro guardado\n");
        printf("3-Busca Dato\n");
        printf("4-Actualizar Datos\n");
		printf("5-salir\n");
        
        scanf("%d",&opc);

        switch(opc){
        case 1:
            system("cls");
            printf("1-Ingresa los datos del alumno\n");
            printf("Id: \n");
            scanf("%d",&alumno.Id);
            printf("nombre del alumno:\n");
            scanf("%s",&alumno.nombre);
            printf("apellidos:\n");
            fflush(stdin);
            scanf("%s",&alumno.apellido);
            printf("Carrera: \n");
            scanf("%s",&alumno.Carrera);//gets(alumno.Carrera);
			printf("Genero: \n");
            scanf("%d",&alumno.Genero);
            printf("Telefono\n");
            scanf("%d",&alumno.Telefono);
            printf("participaciones: \n");
            scanf("%d",&alumno.participaciones);
            system("PAUSE");
            break;
         case 2:
            system("cls");
            printf("Datos guardados\n\n");
            printf("ID: %d\n\n",alumno.Id);
            printf("Nombre: %s\n\n",alumno.nombre);
            printf("Apellidos: %s\n\n",alumno.apellido);
            printf("Carrerar: %d\n\n",alumno.Carrera);
            printf("Genero: %d\n\n",alumno.Genero);
           
            printf("\n");
            system("PAUSE");
            break;
         case 3:
         	system("cls");
         	printf("Buscar Dato\n\n");
         	break;
         case 4:
		 break;
        }

   }while(opc != 5);
    return 0;
}
