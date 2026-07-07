import { defineConfig } from 'vite';
import { resolve } from 'path';

export default defineConfig({
  build: {
    rollupOptions: {
      input: {
        main: resolve(__dirname, 'index.html'),
        worker: resolve(__dirname, 'worker-view.html'),
        player: resolve(__dirname, 'player-view.html'),
        apply: resolve(__dirname, 'apply.html'),
      },
    },
  },
});
