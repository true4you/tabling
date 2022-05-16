<template>

<v-data-table
    :headers="headers"
    :items="orderList"
    :items-per-page="5"
    class="elevation-1"
  ></v-data-table>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'OrderList',
    props: {
      value: Object,
      editMode: Boolean,
      isNew: Boolean
    },
    data: () => ({
        headers: [
            { text: "storeId", value: "storeId" },
            { text: "storeName", value: "storeName" },
            { text: "seatRemained", value: "seatRemained" },
            { text: "waitNum", value: "waitNum" },
            { text: "updatedAt", value: "updatedAt" },
        ],
        orderList : [],
    }),
    async created() {
      var temp = await axios.get(axios.backend + '/orderlists')

      this.orderList = temp.data._embedded.orderlists;

    },
    methods: {
    }
  }
</script>

