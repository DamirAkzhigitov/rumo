<template>
  <div class="street-card">
    <div :class="color"></div>
    <div class="title">{{ title }}</div>
    <div class="cost">{{ cost }}</div>
  </div>
</template>

<script>
export default {
  name: "StreetCard",
  props: {
    color: {
      type: String,
      required: true
    },
    title: {
      type: String,
      required: true
    },
    cost: {
      type: Number,
      required: true
    }
  }
};
</script>

<style lang="scss" scoped>
.street-card {
  width: 100%;
  height: 100%;
  display: flex;
  flex-flow: column;
  justify-content: space-between;
  :first-child {
    height: 20px;
  }
  .grey {
    background-color: gray;
  }
  .red {
    background-color: red;
  }
  .yellow {
    background-color: yellow;
  }
}
</style>
