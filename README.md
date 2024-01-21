# Aplicativo Logic Delivery 🍔🚚

O Logic Delivery é um aplicativo Android de exemplo que demonstra o uso do Jetpack Compose para construir um aplicativo de entrega de produtos.

## Visão Geral

O aplicativo mostra diferentes seções de produtos, cada uma com um nome e uma lista de produtos. A interface do usuário é construída usando o Jetpack Compose, uma moderna ferramenta de desenvolvimento de UI para Android que simplifica o desenvolvimento de interfaces.

## Recursos

- Exibe várias seções de produtos.
- Cada seção tem um nome e uma lista de produtos com seus nomes, preços e imagens.
- Interface de usuário rolável para uma melhor experiência do usuário.

## Estrutura do Projeto

### `model/Product.kt`

```kotlin
package com.logic.logicdelivery.model

import androidx.annotation.DrawableRes
import java.math.BigDecimal

class Product (
    val nome: String,
    val preco: BigDecimal,
    @DrawableRes val imagem: Int
) {
    // TODO: Adicionar métodos ou propriedades relevantes, se necessário. 🛠️
}
```

### `model/ProductSection.kt`

```kotlin
package com.logic.logicdelivery.model

class Productsection(
    val nomeDaSessao: String,
    val productList: List<Product>
) {
    // TODO: Adicionar métodos ou propriedades relevantes, se necessário. 📦
}
```

### `config/HttpConfiguration.kt`

```kotlin
package com.logic.logicdelivery.config

import com.logic.logicdelivery.`interface`.FoodHttpService
import okhttp3.OkHttpClient
import org.springframework.context.annotation.Bean
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class HttpConfiguration {

    private companion object {
        const val BASE_URL = "https://run.mocky.io/v3/"
    }

    private fun buildClient() = OkHttpClient.Builder().build()

    private fun buildRetrofit() = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(buildClient())
        .build()

    @Bean
    fun foodHttpService(): FoodHttpService = buildRetrofit().create(FoodHttpService::class.java)
    // TODO: Adicionar integração com o Retrofit e outras configurações relevantes, se necessário. 🚀
}
```

### `interface/FoodHttpService.kt`

```kotlin
package com.logic.logicdelivery.`interface`

import com.logic.logicdelivery.model.Productsection
import org.springframework.stereotype.Service
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

@Service
interface FoodHttpService {

    @GET("food")
    fun getAll(@Query("food") food: String): Call<List<Productsection>>

    // TODO: Adicionar outros métodos relevantes para a API, se necessário, utilizando o Retrofit. 🌐
}
```

## Como Começar

Este é um repositório de teste para explorar e entender o desenvolvimento de aplicativos Android usando Jetpack Compose.

Para executar o aplicativo em sua máquina local, siga estas etapas:

1. **Clone o repositório:**

   ```bash
   git clone https://github.com/baku01/LogicDeliveryApp.git
   ```

2. **Abra o projeto no Android Studio.**

3. **Execute o aplicativo 🚀**

## Instruções para Testar o Aplicativo

1. Ao iniciar o aplicativo, você será recebido com diferentes seções de produtos na tela principal.

2. Explore as seções para ver os produtos disponíveis.

3. **TODOs:**
    - [ ] Adicione métodos ou propriedades relevantes à classe `Product` 🛠️.
    - [ ] Adicione métodos ou propriedades relevantes à classe `ProductSection` 📦.
    - [ ] Adicione integração com o Retrofit e outras configurações relevantes, se necessário, à classe `HttpConfiguration` 🚀.
    - [ ] Adicione outros métodos relevantes para a API, se necessário, à interface `FoodHttpService`, utilizando o Retrofit 🌐.

## Atualizações Futuras

- **Integração Retrofit:** Planejo implementar a integração com o Retrofit para melhorar as chamadas de API. A inclusão do Retrofit facilitará as solicitações HTTP e o processamento dos dados da API. 🔄

---

Sinta-se à vontade para ajustar conforme necessário e, ao implementar o Retrofit, lembre-se de seguir as práticas recomendadas para integração de bibliotecas no projeto Android. 😊

