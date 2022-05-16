
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OrderMngManager from "./components/OrderMngManager"

import ReceptManager from "./components/ReceptManager"

import SeatManager from "./components/SeatManager"


import OrderList from "./components/OrderList"
export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/orderMngs',
                name: 'OrderMngManager',
                component: OrderMngManager
            },

            {
                path: '/recepts',
                name: 'ReceptManager',
                component: ReceptManager
            },

            {
                path: '/seats',
                name: 'SeatManager',
                component: SeatManager
            },


            {
                path: '/orderLists',
                name: 'OrderList',
                component: OrderList
            },


    ]
})
