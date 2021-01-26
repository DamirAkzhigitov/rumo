<template>
  <div class="game-grid">
    game-grid
    <div class="main">
      <div class="side is-top">
        <div v-for="item in cards" :key="item" class="card-item">
          <street-card
            :title="item.title"
            :color="item.color"
            :cost="item.cost"
          />
        </div>
      </div>
      <div class="side is-right">
        <div v-for="item in cards" :key="item" class="card-item">
          <street-card
            :title="item.title"
            :color="item.color"
            :cost="item.cost"
          />
        </div>
      </div>
      <div class="side is-bottom">
        <div v-for="item in bottomStreet" :key="item" class="card-item">
          <street-card
            :title="item.title"
            :color="item.color"
            :cost="item.cost"
          />
        </div>
      </div>
      <div class="side is-left">
        <div v-for="item in cards" :key="item" class="card-item">
          <street-card
            :title="item.title"
            :color="item.color"
            :cost="item.cost"
          />
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import StreetCard from "../components/StreetCard";
const item = {
  title: "random",
  color: "grey",
  cost: 60
};

const result = [];

for (let i = 0; i <= 9; i++) {
  result.push(item);
}
export default {
  name: "GameGrid",
  components: { StreetCard },
  data() {
    return {
      cards: result,
      bottomStreet: [
        {
          title: "первая парковая ул.",
          cost: 120,
          color: "blue"
        },
        {
          title: "ул. огарева",
          cost: 100,
          color: "blue"
        },
        {
          title: "шанс",
          cost: null,
          color: "chance"
        },
        {
          title: "варшавское шоссе",
          cost: 100,
          color: "blue"
        }
      ]
    };
  }
};
</script>

<style lang="scss" scoped>
.main {
  background-color: #42b983;
  width: 700px;
  height: 700px;
  margin: 0 auto;
  position: relative;
}
.side {
  position: absolute;

  display: flex;
  justify-content: space-between;

  width: 70px;
  height: 70px;
  &.is-left {
    left: -70px;
    top: 0;
    height: 100%;
    flex-flow: column;
  }
  &.is-bottom {
    bottom: -70px;
    left: 0;
    width: 100%;
  }
  &.is-right {
    right: -70px;
    top: 0;
    height: 100%;
    flex-flow: column;
  }
  &.is-top {
    left: 0;
    top: -70px;
    width: 100%;
  }
}
.card-item {
  background-color: navajowhite;
  height: 100%;
  width: 100%;
  display: flex;
  justify-content: center;
  align-items: center;
  border: 1px solid black;
  &:hover {
    background-color: aquamarine;
  }
}
</style>
