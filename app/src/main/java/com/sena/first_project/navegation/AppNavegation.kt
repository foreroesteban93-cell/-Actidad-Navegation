
package com.sena.first_project.navegation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute

import com.sena.first_project.ui.screen.Home
import com.sena.first_project.ui.screen.Producto
import com.sena.first_project.ui.screen.Favoritos
import com.sena.first_project.ui.screen.Perfil
import com.sena.first_project.ui.screen.DetalleProducto as PantallaDetalleProducto

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Inicio
    ) {
        composable<Inicio> {
            Home(
                onirProducto = {
                    navController.navigate(Productos)
                },
                onIrFavoritos = {
                    navController.navigate(Favoritos)
                },
                onIrPerfil = {
                    navController.navigate(Perfil)
                }
            )
        }

        composable<Productos> {
            Producto(
                onirDetalleProducto = {
                    navController.navigate(DetalleProducto(id = 1))
                },
                onVolverHome = {
                    navController.popBackStack()
                }
            )
        }

        composable<DetalleProducto> { entrada ->
            val ruta = entrada.toRoute<DetalleProducto>()

            PantallaDetalleProducto(
                id = ruta.id
            )
        }

        composable<Favoritos> {
            Favoritos(
                onVolver = {
                    navController.popBackStack()
                }
            )
        }

        composable<Perfil> {
            Perfil(
                onVolver = {
                    navController.popBackStack()
                }
            )
        }
    }
}
