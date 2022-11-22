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
      path: 'home',
      element: <MainLayout/>,
      children: [
        {
          path:'login',
          element: <Login/>
        },
        {
          path:'segundaaula',
          element: <SegundaAula/>
        },
        {
          path:'terceiraaula',
          element: <TerceiraAula/>
        },
        {
          path:'quartaaula',
          element: <QuartaAula/>
        },
        {
          path:'quintaaula',
          element: <QuintaAula/>
        },
        {
          path:'setimaaula',
          element: <SetimaAula/>
        },
        {
          path:'oitavaaula',
          element: <OitavaAula/>
        },
        {
          path:'decimaterceiraaula',
          element: <DecimaTerceiraAula/>
        },
        {
          path:'decimaquartaaula',
          element: <DecimaQuartaAula/>
        },
        {
          path:'decimaquintaaula',
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