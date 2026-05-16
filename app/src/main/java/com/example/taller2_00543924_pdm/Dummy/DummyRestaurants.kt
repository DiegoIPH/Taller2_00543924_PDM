package com.example.taller2_00543924_pdm.Dummy

import com.example.taller2_00543924_pdm.Model.Dish
import com.example.taller2_00543924_pdm.Model.Restaurant

val dummyRestaurant = listOf(
    Restaurant(
        id = 1,
        name = "El Pelibuey",
        description = "Carnes asadas y más.",
        imageUrl = "https://lh3.googleusercontent.com/gps-cs-s/APNQkAFMvu8VhRCNeUcWIQOrAwk6QE2QNUuq-M1jV1aHAjgj0X3CA3mcrAIGwrrKAwb8bPLCgKSoUt3ZzXTJS7p55JSbxucPtb0TKpsLVFAHY9AKcbfPxbJB1fmWmLs05SjENkU_l0nu=s1360-w1360-h1020-rw",
        categories = listOf("Asados"),
        menu = listOf(
            Dish(
                id = 101,
                name = "Asado de Pelibuey",
                description = "Delicioso asado de carne de Pelibuey con arroz, frijoles, ensalada y tortilla",
                imageUrl = "https://lh3.googleusercontent.com/gps-cs-s/APNQkAHaX2-SKtZPOb44bK-aA5sUCXaNRH3A-8NWB1B9ehnCDNgjA1LOfFaAJshjD2SiauaS_xv0L--N-FEcnENcSnXtFuI96g7-D1Gex3B50rQuSJKhUJ_6QIAFKnLV6-M7xcZI7HCA=s1360-w1360-h1020-rw"
            ),
            Dish(
                id = 102,
                name = "Asado de Pollo",
                description = "Delicioso Pollo asado con arroz, frijoles, ensalada y tortilla",
                imageUrl = "https://lh3.googleusercontent.com/gps-cs-s/APNQkAHt6Fs4YK0TCsgf-upZxXq2R3cTr9XMGdG_0-sZXqs_hTSyQZ2XP6UycgHFLBzZd6QXFYvua3ggkBFklr11YuWy45Z0kdcJ-NUZoXREgLD-QrBBLObT4FhEBSv3s3zbuuaLtdKE3g=s1360-w1360-h1020-rw"
            )
        )
    ),
    Restaurant(
        id = 2,
        name = "Primitivo",
        description = "Carnes asadas y más.",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ0VYQC_KwMA_6-0EQO9aQiPRspksZboYDPuw&s",
        categories = listOf("Bar y Restaurante", "Asados", "Pastas"),
        menu = listOf(
            Dish(
                id = 201,
                name = "Filete de pescado",
                description = "Filete de pescado con arroz y ensalada fresca",
                imageUrl = "https://www.mexicoenmicocina.com/wp-content/uploads/2018/03/Filetes-de-pescado-%E2%80%93tilapia-al-ajo-o-ajillo-1.jpg"
            ),
            Dish(
                id = 202,
                name = "Hamburguesa de Res",
                description = "Hamburguesa de res con papas fritas y dos aderezos de elección",
                imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTGDAr6MCN6TMfOJSmfLCTb6RharT2BAhV3xQ&s"
            ),
            Dish(
                id = 203,
                name = "Panini de Res",
                description = "Panini de Res con papas fritas, ensalada y dos aderezos de elección",
                imageUrl = "https://www.tunicaragua.com/images/stories/virtuemart/product/paninires.png"
            ),
            Dish(
                id = 204,
                name = "Spaguetti a la boloñesa",
                description = "Delicioso spaguetti a la boloñesa fresco",
                imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTFf3KVSBZjvpv5Sa6hXijdPzwQ-6GDR_MnvQ&s"
            )
        )
    ),
    Restaurant(
        id = 3,
        name = "La Esquina",
        description = "Ambiente casual y familiar con una propuesta de cafetería – restaurante.",
        imageUrl = "https://scontent.fsal7-1.fna.fbcdn.net/v/t39.30808-6/290127112_10228524879576003_4044728216676030432_n.jpg?_nc_cat=111&ccb=1-7&_nc_sid=6ee11a&_nc_ohc=y6xm2Ki54cMQ7kNvwF9Dei2&_nc_oc=AdoX8TUmTYAt3vBu7EQsGUUQWBBK1cty0OA36PtnmiqoRXEA2j3PihShaJ7HRYYwX-w&_nc_zt=23&_nc_ht=scontent.fsal7-1.fna&_nc_gid=DulL6Mk-ZUHcVc_EM_D5AQ&_nc_ss=7b2a8&oh=00_Af4TBrUKynnCSbrC2pagRhnTQAu9BnKuilOFU47naihnKw&oe=6A0D4170",
        categories = listOf("Hamburguesas", "Pastas", "Cafetería","Bar y Restaurante"),
        menu = listOf(
            Dish(
                id = 301,
                name = "Hamburguesa clásica",
                description = "Hamburguesa de res con bacon, papas fritas, cebolla caramelizada y queso amarillo.",
                imageUrl = "https://scontent.fsal7-1.fna.fbcdn.net/v/t39.30808-6/674185862_937371589029247_3284275173151808408_n.jpg?stp=cp6_dst-jpg_tt6&_nc_cat=109&ccb=1-7&_nc_sid=127cfc&_nc_ohc=wOwJg_PsqDcQ7kNvwGxwsUU&_nc_oc=AdqxbrCR_TiOYk2CeaogvSkg2p-VgoktcjuWX_WZCky8ArElsnltToK_1tReYdJ22DA&_nc_zt=23&_nc_ht=scontent.fsal7-1.fna&_nc_gid=LsrXPW0-z44Dvx7e3onekQ&_nc_ss=7b2a8&oh=00_Af68Kr118BhX7U-mrbqupW3OhflhEJECJqCHXTGRjVctdw&oe=6A0D34B0"
            ),
            Dish(
                id = 302,
                name = "Deditos de Pescado",
                description = "Dedos de pescado con arroz, tostones, ensañada y salsa ranch",
                imageUrl = "https://scontent.fsal7-1.fna.fbcdn.net/v/t39.30808-6/657155802_918262607606812_8586081232271796364_n.jpg?_nc_cat=105&ccb=1-7&_nc_sid=127cfc&_nc_ohc=Otfv1nHLhUUQ7kNvwHDdxWn&_nc_oc=Adpy77qIVg_P5HE-y8pM9IOSiqOYYMk6QYhCxnlDDAOWkZAD9NtK74Tb1gwg1WMMUZk&_nc_zt=23&_nc_ht=scontent.fsal7-1.fna&_nc_gid=2RN6VOFr2PSWW6pftE2uHQ&_nc_ss=7b2a8&oh=00_Af4UXkaqzZe8DweRgon7DkTa5FrZyaY5Q4ZPgRbjsUi4OQ&oe=6A0D4978"
            ),
            Dish(
                id = 303,
                name = "Cheesecake",
                description = "Cheesecake con baño a elección entre maracuyá, fresa y chocolate",
                imageUrl = "https://scontent.fsal7-1.fna.fbcdn.net/v/t39.30808-6/564571897_792247316875009_2356108997508727033_n.jpg?stp=cp6_dst-jpg_tt6&_nc_cat=102&ccb=1-7&_nc_sid=127cfc&_nc_ohc=evgBvzfNvmwQ7kNvwHnBrAO&_nc_oc=Adp7Se9atGkBIB4a41YecbR7_Owpc_NhiuN1edfdVbhNt99XHmVIk_3UxMq4oXLdKEM&_nc_zt=23&_nc_ht=scontent.fsal7-1.fna&_nc_gid=AFTIVbDh2OyxirwQeOBYHg&_nc_ss=7b2a8&oh=00_Af6iJZcf7G2Jn7Yvm7nOKUzTF3STs6V-fTf0up_purBqSw&oe=6A0D6695"
            )
        )
    ),
    Restaurant(
        id = 4,
        name = "SUA",
        description = "Restaurante especializado en pizzas, pastas y otras delicias de la cocina mediterránea.",
        imageUrl = "https://scontent.fsal7-1.fna.fbcdn.net/v/t1.6435-9/81521968_129196485217194_7653864336900751360_n.jpg?_nc_cat=111&ccb=1-7&_nc_sid=6ee11a&_nc_ohc=_bQD1cpljjUQ7kNvwHrY4Ex&_nc_oc=AdqzjRE1upNHw1sWlJVOrc3ax5qPg5t0iGOBuow4vdBDV_m1VlY5WOR-U90Pf3BjMeE&_nc_zt=23&_nc_ht=scontent.fsal7-1.fna&_nc_gid=FDtEPbNk03ocBeGlVupHjA&_nc_ss=7b2a8&oh=00_Af4dxg5hZ2PYtBiLHrdqunPkBSjQN5N9xbLa9hCPWaRhdA&oe=6A2F4609",
        categories = listOf("Pizzas", "Pastas","Bar y Restaurante"),
        menu = listOf(
            Dish(
                id = 401,
                name = "Pizza cuatro estaciones",
                description = "Hecha con ingredientes frescos y auténticos que te transportarán directo al Mediterráneo.",
                imageUrl = "https://scontent.fsal7-1.fna.fbcdn.net/v/t39.30808-6/588411393_1428418592618481_1726036777208381524_n.jpg?_nc_cat=104&ccb=1-7&_nc_sid=127cfc&_nc_ohc=ZiO3su83umcQ7kNvwG-gROu&_nc_oc=AdqBDQH5FcEOL2gAbtQXepWya-RMORea_-xOg8ENXVFX6UsmxXkBkp8pN9jGdkWrk14&_nc_zt=23&_nc_ht=scontent.fsal7-1.fna&_nc_gid=je63Ecj_5Vzt41GL4gn91Q&_nc_ss=7b2a8&oh=00_Af55nm5q1wmMg39GkqwzsGJAGGNieJWS0lsgx39bZmtuTw&oe=6A0DBCC9"
            ),
            Dish(
                id = 402,
                name = "Pasta con camarones",
                description = "Spaguetti con camarones.",
                imageUrl = "https://scontent.fsal7-1.fna.fbcdn.net/v/t39.30808-6/492664166_1230905532369789_801963947134262089_n.jpg?_nc_cat=106&ccb=1-7&_nc_sid=833d8c&_nc_ohc=eA7gWVG5wRQQ7kNvwF7tk-Z&_nc_oc=AdpwWekF6tkP69C9l9RL1PCLKy7hYhjZItkXV3Ygdqo4lbDnxPgOPKtsGYa34JQdWqI&_nc_zt=23&_nc_ht=scontent.fsal7-1.fna&_nc_gid=5W0_Tk037A0xhzQr5Co1hg&_nc_ss=7b2a8&oh=00_Af54tmuov1eTWy06_Vh98go33x0F5sH9igJ6_lgjmIWnbg&oe=6A0DC236"
            ),
            Dish(
                id = 403,
                name = "lasaña a la boloñesa",
                description = "lasagna a la boloñesa con pasta fresca y nuestra salsa rústica de tomate natural.",
                imageUrl = "https://scontent.fsal7-1.fna.fbcdn.net/v/t39.30808-6/480649142_1171634004963609_2200275361860098591_n.jpg?_nc_cat=105&ccb=1-7&_nc_sid=833d8c&_nc_ohc=xlJv0u6YTbIQ7kNvwETvnJI&_nc_oc=Ado422Ha01De4iJrHvmALEs0sDnAme_d4niEFzAooLf32CXZESJb544rt53uRFxZe2Q&_nc_zt=23&_nc_ht=scontent.fsal7-1.fna&_nc_gid=dpTtHwkMxVtjyn1D7MG7pA&_nc_ss=7b2a8&oh=00_Af4ZHrRV7cPMKKfybxkPSUEjD9YzdYF6uDGoPknoV9PUpA&oe=6A0D9843"
            )
        )
    ),
    Restaurant(
        id = 5,
        name = "Italianissimo",
        description = "Especializados en comida Italiana",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR8MeXZa0VxGg6bWRNgbbbllAvj-M6IDmvOZw&s",
        categories = listOf("Bar y Restaurante", "Pizzas", "Pastas"),
        menu = listOf(
            Dish(
                id = 501,
                name = "Pizza Margarita",
                description = "Recién hecha y con ingredientes frescos.",
                imageUrl = "https://scontent.fsal7-1.fna.fbcdn.net/v/t39.30808-6/631522004_1360166212818671_4952502676878149315_n.jpg?_nc_cat=103&ccb=1-7&_nc_sid=833d8c&_nc_ohc=J_QUuHO1lu4Q7kNvwEMAdMn&_nc_oc=AdpOLLE4nMqctChm7miaYikalvFdIg4VdvJQHMhyvU_6XvgoHyR833TRe1kEnAZK9rw&_nc_zt=23&_nc_ht=scontent.fsal7-1.fna&_nc_gid=Xnbp1RTdmHACg5ahEeZM1Q&_nc_ss=7b2a8&oh=00_Af523NU0P6CWkNdMDKsEj2KuYQaP25GZbZ57j4yxeGEPVg&oe=6A0DC809"
            ),
            Dish(
                id = 502,
                name = "Milanesa de Pollo",
                description = "Milanesa de Pollo bañada en queso cheddar y acompañada de papas fritas",
                imageUrl = "https://scontent.fsal7-1.fna.fbcdn.net/v/t39.30808-6/535569723_1214111334090827_4011524781258563465_n.jpg?stp=cp6_dst-jpg_tt6&_nc_cat=101&ccb=1-7&_nc_sid=833d8c&_nc_ohc=r9gooYE3rOAQ7kNvwHXdAlK&_nc_oc=AdrfynWt14jphNucGfPp8lMCZCRkRCUOh7eyf74PrrEdKy9HqfDVk9PySql32fvPmC0&_nc_zt=23&_nc_ht=scontent.fsal7-1.fna&_nc_gid=DY1EPaFJWJOK6uzMIHG5VA&_nc_ss=7b2a8&oh=00_Af43mFC0TrYw4Z6NydrjEJafLkyO7J0YjNa9EnAqBKLYAQ&oe=6A0DBC0A"
            ),
            Dish(
                id = 503,
                name = "Pizza Calabresa",
                description = "Una mordida y entendés por qué la Calabrese es tan popular",
                imageUrl = "https://scontent.fsal7-1.fna.fbcdn.net/v/t39.30808-6/600148442_1310616267773666_5709504358673798568_n.jpg?_nc_cat=104&ccb=1-7&_nc_sid=127cfc&_nc_ohc=dtaUozW53xcQ7kNvwGzx8po&_nc_oc=Adp4ovyDkieOZwVKBmqUsauZqf1IL17HFitxa5lF2qg_8JxU0g2vdMqeuEW9VlpCHmQ&_nc_zt=23&_nc_ht=scontent.fsal7-1.fna&_nc_gid=w-rWM20pWXCJucNa63iUBQ&_nc_ss=7b2a8&oh=00_Af5KvC0kjeMmJ8KLD4D9g4MZsKgb3j6ECwI0TyQOB0R0pQ&oe=6A0DC3C8"
            ),
            Dish(
                id = 504,
                name = "Pasta de camarones",
                description = "Regálate un momento de puro placer. Nuestra pasta de camarones en Italianissimo es esa delicia que te mereces",
                imageUrl = "https://scontent.fsal7-1.fna.fbcdn.net/v/t39.30808-6/515501833_1191549589680335_880758829353133586_n.jpg?_nc_cat=100&ccb=1-7&_nc_sid=833d8c&_nc_ohc=i3YfGM73jKQQ7kNvwE_WVtd&_nc_oc=AdprvXDzyQ7gE44uqRs01qPM02bm43Uy6sRwxkZCwVw36AzrRnbUxfRhRuB-szEkOoc&_nc_zt=23&_nc_ht=scontent.fsal7-1.fna&_nc_gid=xm1HmlIWdO5LsIKrcq3cJQ&_nc_ss=7b2a8&oh=00_Af78W63AC9dY5sgvCwRIXJ2ILyMIdDf9wRJrtYv_MY76qg&oe=6A0DA7DF"
            )
        )
    ),
    Restaurant(
        id = 6,
        name = "Frenni Fazclaire Pizza",
        description = "Jor jor jorjorjor",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQNhUvtJTh5EQYUDQy-n-F4RzPCuHb2msfbNg&s",
        categories = listOf("Pizzas", "Bar y Restaurante"),
        menu = listOf(
            Dish(
                id = 601,
                name = "Pizza de Pepperoni",
                description = "Recién hecha y con ingredientes frescos.",
                imageUrl = "https://www.sortirambnens.com/wp-content/uploads/2019/02/pizza-de-peperoni.jpg"
            ),
            Dish(
                id = 602,
                name = "Pizza con piña",
                description = "Nuestra especial del 87.",
                imageUrl = "https://lh3.googleusercontent.com/TxD94qPVO6PzHuQWjtc8MPYZryYjhQ1Q2SEWaxq0lKWpPqEarFMFR5kx-54zdG3ZiD6EQXmpdJ2nZCFPlaGGGM-f-ulvntUz8Ck=s0"
            ),
            Dish(
                id = 503,
                name = "Pizza Cuatro Quesos",
                description = "La favorita de Bonfie.",
                imageUrl = "https://www.novachef.es/media/images/pizza-cuatro-quesos.jpg"
            ),
            Dish(
                id = 504,
                name = "Pizza Cuatro Estaciones",
                description = "Cada estación representa a una animatrónica.",
                imageUrl = "https://i.blogs.es/2b355a/pizza-4-estaciones/1200_900.jpg"
            )
        )
    )
)