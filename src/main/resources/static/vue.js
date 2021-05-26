const MyApp = {
    data() {
        return {
            name1: "",
            email1: "",
            numberPhone1: "",
        }
    },

    methods: {
        func(event) {
            console.log("func");
            this.name1 = "";
            event.preventDefault();
            this.query = "";
        },

        sendFeedbackFormToServer(event) {
            axios.post('http://localhost:8080/test/feedback', {
                name: this.name1,
                email: this.email1,
                numberPhone: this.numberPhone1
            })
                .then(function(response) {
                    console.log(response);
                    this.name1 = "";
                })
                .catch(function (error) {
                    console.log(error);
                });
            this.name1 = "";
            this.email1 = "";
            this.numberPhone1 = "";
            // event.preventDefault();
            this.query = "";
        }
    }
};


Vue.createApp(MyApp).mount('#app');

// const app = Vue.createApp(App);
//
// app.mount('#app');