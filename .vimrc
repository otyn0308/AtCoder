if has("syntax")
  syntax on
endif


if has('vim_starting')
  set runtimepath+=~/.vim/bundle/neobundle.vim/
endif

call neobundle#begin(expand('~/.vim/bundle/'))

NeoBundle 'Shougo/unite.vim'
NeoBundle 'Shougo/vimfiler'
NeoBundle 'tomasr/molokai'
NeoBundle 'scrooloose/nerdtree'
NeoBundle 'Townk/vim-autoclose'
NeoBundle 'ConradIrwin/vim-bracketed-paste'

call neobundle#end()
NeoBundleCheck

filetype plugin indent on
colorscheme molokai

set number
set title
set cursorline
set showcmd
set laststatus=2
set expandtab
set tabstop=2
set shiftwidth=2
set showmatch
set hidden
set nobackup
set noswapfile
set ignorecase
set smartcase
set hlsearch

nnoremap <silent><C-e> :NERDTree<CR>
