<template>
  <div class="game-container">
    game
    <div class="card">
      <div class="card-side">
        <div v-for="item in row" :key="item" class="card-item">
          {{ item }}
        </div>
      </div>
      <div class="card-item pole"></div>
      <div class="card-side">
        <div v-for="item in row" :key="item" class="card-item">
          {{ item }}
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "game",
  data() {
    return {
      row: 9
    };
  }
};
</script>

<style lang="scss" scoped>
.card {
  width: 700px;
  margin: 0 auto;
  display: flex;
  flex-flow: row wrap;
  justify-content: space-between;
  &-side {
    width: 100%;
    display: flex;
  }
  &-item {
    border: 1px solid;
    height: 130px;
    width: 80px;
  }
  &-side-item {
    width: 130px;
    height: 80px;
    border: 1px solid;
  }
}
.pole {
  height: 600px;
  width: 100%;
}
</style>
