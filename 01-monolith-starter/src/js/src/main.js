import 'babel-polyfill';
//tag::content[]
import Vue from 'vue';
import App from './components/App.vue';

const store = {
  state: {
    tabs: Object.freeze({
      publicFeed: 'PublicFeed',
      personalFeed: 'PersonalFeed',
    }),
    currentTab: 'PublicFeed',
  },
  mutate: {
    setCurrentTab(tab) {
      if (!tab) return;
      const aTab = this.state.tabs[tab];
      if (aTab) this.state.currentTab = tab;
    },
  },
};

new Vue({
  el: '#app',
  render: h => h(App),
  data: {
    store,
  },
});
//end::content[]
