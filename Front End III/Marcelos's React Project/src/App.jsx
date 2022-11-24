import {
  createBrowserRouter,
  RouterProvider,
  Route,
} from "react-router-dom";

import { TerceiraAula } from './aulas/TerceiraAula'
import { SegundaAula } from './aulas/SegundaAula'
import { Login } from './pages/Login'
import { QuartaAula } from './aulas/QuartaAula'
import { QuintaAula } from './aulas/QuintaAula'
import { SetimaAula } from './aulas/SetimaAula'
import { OitavaAula } from "./aulas/OitavaAula"
import { DecimaTerceiraAula } from "./aulas/DecimaTerceiraAula"
import { DecimaQuartaAula } from "./aulas/DecimaQuartaAula"
import { DecimaQuintaAula } from "./aulas/DecimaQuintaAula"
import { MainLayout } from "./components/MainLayout";

function App() {

  const appRouter = createBrowserRouter([
    {
      path: '',
      element: <MainLayout/>,
      children: [
        {
          path:'login',
          element: <Login/>
        },
        {
          path:'segundaaula/:id',
          element: <SegundaAula/>
        },
        {
          path:'terceiraaula/:id',
          element: <TerceiraAula/>
        },
        {
          path:'quartaaula/:id',
          element: <QuartaAula/>
        },
        {
          path:'quintaaula/:id',
          element: <QuintaAula/>
        },
        {
          path:'setimaaula/:id',
          element: <SetimaAula/>
        },
        {
          path:'oitavaaula/:id',
          element: <OitavaAula/>
        },
        {
          path:'decimaterceiraaula/:id',
          element: <DecimaTerceiraAula/>
        },
        {
          path:'decimaquartaaula/:id',
          element: <DecimaQuartaAula/>
        },
        {
          path:'decimaquintaaula/:id',
          element: <DecimaQuintaAula/>
        }
      ]
    }
  ])

  return (

    <RouterProvider router={appRouter}/>
  )

}

export default App