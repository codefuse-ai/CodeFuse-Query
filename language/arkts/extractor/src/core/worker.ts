/**
 * Copyright 2024 Ant Group CO., Ltd.
 */
/* eslint-disable @typescript-eslint/no-explicit-any */

import { PrismaClient } from "@prisma/client";
import { expose } from "threads/worker";

import { Coref, createPrismaClient, persistCoref } from "../dal/db";

let prismaClient: PrismaClient | undefined;

expose({
  /**
   * Init the prisma client of this writer thread.
   * This method must be called first before other methods of the writer.
   *
   * @param dbPath the db file path
   */
  initPrismaClient(dbPath: string) {
    if (!prismaClient) {
      prismaClient = createPrismaClient(dbPath);
    }
  },

  /**
   * Persist the coref data
   *
   * @param corefData
   * @returns
   */
  async persistCoref(corefData: Coref) {
    if (!prismaClient) {
      return;
    }

    const creations = persistCoref(prismaClient, corefData);
    await prismaClient.$transaction(creations);
  },
});
