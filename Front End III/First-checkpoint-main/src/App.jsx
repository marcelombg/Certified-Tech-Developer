import { useState } from 'react'
import { Card } from './Card'
import './style_app.scss'

// Aqui você irá escrever as suas funções de Validação, para verificar se o Formulário foi preenchido corretamente

function App() {
  // Aqui você irá criar os Estados para manipular os Inputs

  const [nomeProduto, setNomeProduto] = useState('')
  const [codigoCor, setCodigoCor] = useState('')
  const [formularioErro, setFormularioErro] = useState(false)
  const [allProducts, setAllProducts] = useState([])

  function cadastrarCor(event) {

    event.preventDefault();

    const novoProdutoCadastrado = {
      name: nomeProduto,
      codigo: codigoCor,

    }

    if (codigoCor == '' && nomeProduto == '') {

      setFormularioErro(true)

    } else {

      setFormularioErro(false)
      setNomeProduto('')
      setCodigoCor('')
      setAllProducts([novoProdutoCadastrado, ...allProducts])

    }
  }

  return (

    <main className="checkpoint-component">

      <div className="tittle-wrapper">
        <h1>Seletor de Cores</h1>
      </div>

      <div className="form">

        <h1>ADICIONAR NOVA COR</h1>

        <form className={formularioErro ? 'form-error' : ''} onSubmit={event => cadastrarCor(event)}>

          <label htmlFor="nomeProduto">Nome </label>
          <input type="text" onChange={event => setNomeProduto(event.target.value)} />

          <label htmlFor="codigoCor">Cor </label>
          <input id="codigoCor" type="color" list="presetColors" value={codigoCor} onChange={event => setCodigoCor(event.target.value)} />
          <datalist id="presetColors">
            <option value="presetColors"></option>
            <option value="presetColors"></option>
            <option value="presetColors"></option>
          </datalist>

          <button type='submit'>ADICIONAR</button>

        </form>

      </div>

      {
        formularioErro ? (
          <span className='error'>Nenhuma cor foi escolhida</span>
        ) : null
      }

      <section className='products'>
        {
          allProducts.map(
            product => {
              return (
                <Card
                  productData={product}
                  color={codigoCor}
                />
              )
            }
          )
        }
      </section>

    </main>
  )
}

export default App