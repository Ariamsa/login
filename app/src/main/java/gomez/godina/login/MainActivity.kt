package gomez.godina.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    /*Declaramos variables globales.*/
    val USUARIO_REGISTRADO = "Sara"
    val PASS_USUARIO = "hola123"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*Para obtener datos de la vista*/

        btningresar.setOnClickListener {
            val usuario = editTextUsuario.text.toString()
            val pass = editTextPassword.text.toString()
            if (!cadenaVacia(usuario) and !cadenaVacia(pass)) {
                if (verificarDatos(usuario,pass)){
                    mensaje("Bienvenido")
                }else{
                    mensaje("Datos Incorrectos")
                }
            } else {
                mensaje("datos vacios")
            }
        }
    }
    fun verificarDatos(usuario:String, pass:String):Boolean{
        return usuario.equals(USUARIO_REGISTRADO) and pass.equals(PASS_USUARIO)
    }

    //Metodo que nos ayuda a mostrar Toasts
    fun mensaje(mensaje: String) {
        Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show()
    }

    //Verificaer que una cadena este vacia
    fun cadenaVacia(cadenaVerificar: String): Boolean {
        return cadenaVerificar.isEmpty()
    }
}

    /*
    * 1.- leer usuario
    * 2.- leer contraseña
    * 3.- verificar que no esten vacios
    * 4.- Comparar que el usuario sea un usuario permitido
    * 5.- Comparar contraseña con la de otro usuario
    * 6.- Si los datos son permitidos, damos un mensaje de bienvenida de lo contrario,
    * pedimos nuevamente los datos*/

