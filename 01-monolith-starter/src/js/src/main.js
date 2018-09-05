import 'babel-polyfill';

import Vue from 'vue';
import App from './components/App.vue';

const tabs = Object.freeze({
  PUBLIC_FEED: 'PUBLIC_FEED',
  PERSONAL_FEED: 'PERSONAL_FEED',
});

const store = {
  state: {
    tabs,
    currentTab: tabs.PERSONAL_FEED,
  },
  mutate: {
    setCurrentTab(tab) {
      const isValidTab = Object.values(store.state.tabs)
        .filter(v => v === tab)
        .length === 1;
      if (isValidTab) store.state.currentTab = tab;
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
